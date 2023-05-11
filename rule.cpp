#include "rule.h"
#include <cctype>

static bool isWordCharacter(int ch) {
    return std::isalnum(ch) || ch == '_';
}

static bool isWordBoundary(const std::string &text, size_t pos) {
    bool left = pos != 0 && isWordCharacter(text[pos - 1]);
    bool right = pos != text.length() && isWordCharacter(text[pos]);
    return left != right;
}

int Rule::match(const std::string &text, int pos) const {
    if (type == EPSILON)
        return 0;

    if (type == ANCHOR)
        return anchorMatches(text, pos) ? 0 : -1;

    return pos != (int)text.length() && matches(text[pos]) ? 1 : -1;
}

bool Rule::matches(unsigned char ch) const {
    if (type == NORMAL)
        return ch == by.front();

    if (type == RANGE)
        return ch >= by.front() && ch <= to.front();

    if (type == SPECIAL) {
        switch (by.front()) {
            case '*': return true;
            case '.': return ch != '\r' && ch != '\n';
            case 'd': return std::isdigit(ch);
            case 's': return std::isspace(ch);
            case 'w': return isWordCharacter(ch);
            case 'D': return !std::isdigit(ch);
            case 'S': return !std::isspace(ch);
            case 'W': return !isWordCharacter(ch);
        }
    }

    return false;
}

bool Rule::anchorMatches(const std::string &text, int pos) const {
    if (type == ANCHOR) {
        switch (by.front()) {
            case '^': return pos == 0;
            case '$': return pos == (int)text.length();
            case 'b': return isWordBoundary(text, pos);
            case 'B': return !isWordBoundary(text, pos);
        }
    }

    return false;
}
