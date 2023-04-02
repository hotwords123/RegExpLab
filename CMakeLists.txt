cmake_minimum_required(VERSION 3.8)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(nfa main-nfa.cpp nfa.cpp nfa.h)
