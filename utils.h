#ifndef CPP_UTILS_H
#define CPP_UTILS_H

#include <string>

inline std::string strip(const std::string &s) {
    auto start = s.find_first_not_of(' ');
    auto end = s.find_last_not_of(' ');
    if (start == std::string::npos || end == std::string::npos) return "";
    return s.substr(start, end + 1 - start);
}


#endif //CPP_UTILS_H
