#ifndef CPP_UTILS_H
#define CPP_UTILS_H

#include <string>

#if defined(_WIN32) || defined(__CYGWIN__)

#include <io.h>
#include <fcntl.h>

#endif

inline std::string strip(const std::string &s) {
    auto start = s.find_first_not_of(' ');
    auto end = s.find_last_not_of(' ');
    if (start == std::string::npos || end == std::string::npos) return "";
    return s.substr(start, end + 1 - start);
}

inline void setStdoutToBinary() {
#ifdef _WIN32
    _setmode(_fileno(stdout), _O_BINARY);
#endif
#ifdef __CYGWIN__
    setmode(fileno(stdout), O_BINARY);
#endif
}


#endif //CPP_UTILS_H
