#include "rule.h"
#include <cctype>

bool Rule::matches(unsigned char ch) const {
    if (type == NORMAL)
        return ch == by.front();

    if (type == RANGE)
        return ch >= by.front() && ch <= to.front();

    if (type == SPECIAL) {
        switch (by.front()) {
            case '.': return ch != '\r' && ch != '\n';
            case 'd': return std::isdigit(ch);
            case 's': return std::isspace(ch);
            case 'w': return std::isalnum(ch) || ch == '_';
            case 'D': return !std::isdigit(ch);
            case 'S': return !std::isspace(ch);
            case 'W': return !(std::isalnum(ch) || ch == '_');
        }
    }

    return false;
}
