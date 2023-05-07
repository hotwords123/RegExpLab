#include <iostream>
#include <sstream>
#include "nfa.h"

/**
 * 本程序支持两种运行方式：
 * 1、将输入文件的文件名作为唯一的命令行参数传入。
 *    例如: ./nfa ../cases/01.txt
 * 2、若不传入任何参数，则程序将从stdin中读取输入。
 */

/**
 * 程序入口点函数。已经帮你封装好了读取文本输入、构造自动机并执行字符串、输出结果等。
 * 一般来说，你不需要阅读和改动这里的代码，只需要完成exec函数即可。
 */
int main(int argc, char* argv[]) {
    FILE* f;
    if (argc >= 2) {
        f = fopen(argv[1], "r");
        if (!f) throw std::system_error(errno, std::generic_category());
    } else f = stdin;

    std::string text;
    const int BUFSIZE = 4096;
    char buf[BUFSIZE+1];
    size_t n;
    do {
        n = fread(buf, 1, BUFSIZE, f);
        buf[n] = 0;
        text += buf;
    } while (n == BUFSIZE);
    if (!feof(f)) throw std::system_error(errno, std::generic_category());

    std::string input_str;
    bool input_str_found = false;
    std::istringstream ss(text);
    std::string line;
    while (std::getline(ss, line)) {
        if (line.find("input: ") == 0) {
            input_str = line.substr(7);
            input_str_found = true;
        }
    }
    if (!input_str_found) throw std::runtime_error("未找到输入字符串！注意输入字符串必须以input: 开头，其中冒号后面必须有空格！");

    NFA nfa = NFA::from_text(text);
    Path result = nfa.exec(input_str);
    std::cout << result;

    return 0;
}
