#include "regex-compile-listener.h"

RegexCompileListener::RegexCompileListener(Regex &regex)
    : regex(regex) {}

void RegexCompileListener::enterRegex(regexParser::RegexContext *ctx) {
    // todo
}