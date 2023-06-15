#include "regex.h"
#include "lib/json.hpp"
#include "utils.h"

/**
 * 本程序支持两种运行方式：
 * 1、将输入文件的文件名作为唯一的命令行参数传入。
 *    例如: ./regex ../cases/01.txt
 * 2、若不传入任何参数，则程序将从stdin中读取输入。
 */

/**
 * 程序入口点函数。已经帮你封装好了读取文本输入、调用compile方法和match等方法、输出结果等。
 * 一般来说，你不需要阅读和改动这里的代码，只需要完成上面Regex类中的标有TODO的函数即可。
 */
int main(int argc, char *argv[]) {
    FILE *f;
    if (argc >= 2) {
        f = fopen(argv[1], "r");
        if (!f) throw std::system_error(errno, std::generic_category());
    } else f = stdin;

    std::string text;
    const int BUFSIZE = 4096;
    char buf[BUFSIZE + 1];
    size_t n;
    do {
        n = fread(buf, 1, BUFSIZE, f);
        buf[n] = 0;
        text += buf;
    } while (n == BUFSIZE);
    if (!feof(f)) throw std::system_error(errno, std::generic_category());

    std::string type, pattern, flags, input_str, replacement;
    bool pattern_found = false, input_str_found = false, replacement_found = false;
    std::istringstream ss(text);
    std::string line;
    size_t lenBeforeInputLine = 0;
    while (std::getline(ss, line)) {
        if (line.find("type:") == 0) {
            type = strip(line.substr(5));
        } else if (line.find("pattern: ") == 0) {
            pattern = line.substr(9);
            pattern_found = true;
        } else if (line.find("flags:") == 0) {
            flags = strip(line.substr(6));
        } else if (line.find("replacement: ") == 0) {
            replacement = line.substr(13);
            replacement_found = true;
        } else if (line.find("input: ") == 0) {
            input_str = text.substr(lenBeforeInputLine + 7);
            input_str_found = true;
        }
        lenBeforeInputLine += line.size() + 1;
    }
    if (!pattern_found || !input_str_found)
        throw std::runtime_error("pattern或input未找到！注意pattern: 和input: ，冒号后面必须有空格！");

    Regex regex = Regex::compile(pattern, flags);
    if (type == "find" || type == "match") {
        std::vector<std::string> result = regex.match(input_str);
        std::cout << nlohmann::json(result) << std::endl;
    } else if (type == "matchAll") {
        std::vector<std::vector<std::string>> result = regex.matchAll(input_str);
        std::cout << nlohmann::json(result) << std::endl;
    } else if (type == "replaceAll") {
        if (!replacement_found) throw std::runtime_error("type=replaceAll的输入，但是未找到replacement字段！");
        std::string result = regex.replaceAll(input_str, replacement);
        std::cout << result;
    } else {
        throw std::runtime_error("不支持的输入文件类型！");
    }

    return 0;
}