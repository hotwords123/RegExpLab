#ifndef CPP_NFA_H
#define CPP_NFA_H

#include "rule.h"
#include <string>
#include <vector>
#include <iostream>

/**
 * 本文件（包括对应的cpp文件）中已经定义好了一些类和函数，类内也已经定义好了一些成员变量和方法。不建议大家修改这些已经定义好的东西。
 * 但是，为了实现功能，你可以自由地增加新的函数、类等，包括可以在已经定义好的类自由地添加新的成员变量和方法。
 */
/**
 * 在第一次实验中，保证状态转移规则的字母和输入的字符串都仅包含ASCII字符，且不包含'\0'和换行符'\r' '\n'。
 * 第一次实验要求支持的特殊字符有：\d \w \s \D \W \S \.
 * 前六个的定义同一般正则表达式中的定义，最后一个\.则等同于一般正则表达式中的.，可匹配任何字符。
 * 各个字符的具体定义可查看 https://www.runoob.com/regexp/regexp-metachar.html
 */

/**
 * 表示一条从初态到终态的路径。（也可以用来表示不存在路径的拒绝结果。）
 * 当输入字符串的执行结果是接受时，你需要根据接受的路径，正确实例化一个该结构体并返回。
 * 当输入字符串的执行结果是拒绝时，你应该返回Path::reject()。
 */
struct Path {
    std::vector<int> states; // 从初态到终态经历的状态列表。开头必须是0。
    std::vector<std::string> consumes; // 长度必须为states的长度-1。consumes[i]表示states[i]迁移到states[i+1]时所消耗的字母（若是不消耗字母的epsilon转移，则设为空串""即可）]

    static Path reject() { return Path{}; }
};

/**
 * 将Path转为（序列化为）文本的表达格式（以便于通过stdout输出）
 * 你不需要理解此函数的含义、阅读此函数的实现和调用此函数。
 */
std::ostream &operator<<(std::ostream &os, const Path &path);

/**
 * 表示一个NFA的类。
 * 本类定义的自动机，约定状态用编号0~(num_states-1)表示，初态固定为0。
 */
class NFA {
    int num_states = 0; // 状态个数
    std::vector<bool> is_final; // 用于判断状态是否为终态的数组，长为num_states。is_final[i]为true表示状态i为终态。
    std::vector<std::vector<Rule>> rules; // 表示所有状态转移规则的二维数组，长为num_states。rules[i]表示从状态i出发的所有转移规则。

    friend class NFAExecutor;
    friend class NFAFragment;

public:
    /**
     * 向自动机中加入新状态。
     * @param count 状态数量
     * @return 加入的首个状态的下标
     */
    int append_states(int count);

    /**
     * 在自动机上执行指定的输入字符串。
     * TODO 请你完成这个函数；请在nfa.cpp中完成。
     * @param text 输入字符串
     * @return 若拒绝，请 return Path::reject(); 。若接受，请手工构造一个Path的实例并返回。
     */
    Path exec(const std::string &text);

    /**
     * 从自动机的文本表示构造自动机
     * 你不需要理解此函数的含义、阅读此函数的实现和调用此函数。
     */
    static NFA from_text(const std::string &text);
};

#endif // CPP_NFA_H
