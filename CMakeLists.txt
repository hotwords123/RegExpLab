cmake_minimum_required(VERSION 3.15)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

list(APPEND CMAKE_MODULE_PATH ${PROJECT_SOURCE_DIR}/lib/antlr)
set(ANTLR4_ZIP_REPOSITORY ${PROJECT_SOURCE_DIR}/lib/antlr/antlr4-cpp-runtime-4.12.0-source.zip)
set(ANTLR_BUILD_CPP_TESTS OFF) # 否则，antlr4-cpp-runtime会联网拉取github.com/google/googletest依赖
include(ExternalAntlr4Cpp)
message(STATUS "Found antlr4 static libs: ${ANTLR4_STATIC_LIBRARIES} and includes: ${ANTLR4_INCLUDE_DIRS} ")

if(MINGW)
    add_compile_options(-Wall -Wextra -Wno-missing-field-initializers)
    add_link_options(-static -static-libgcc -static-libstdc++)
endif()

# 针对MSVC的配置
add_compile_options("$<$<C_COMPILER_ID:MSVC>:/utf-8>")
add_compile_options("$<$<CXX_COMPILER_ID:MSVC>:/utf-8>")
set(CMAKE_MSVC_RUNTIME_LIBRARY "MultiThreaded$<$<CONFIG:Debug>:Debug>") # 使项目静态链接CRT，否则会报错LNK2038：检测到“RuntimeLibrary”的不匹配项

add_executable(nfa main-nfa.cpp
    nfa.cpp nfa.h rule.cpp rule.h nfa-executor.cpp nfa-executor.h utils.h
)

add_executable(regex main-regex.cpp
    nfa.cpp nfa.h rule.cpp rule.h nfa-executor.cpp nfa-executor.h utils.h
    regex.cpp regex.h nfa-fragment.h
    regex-compile-listener.cpp regex-compile-listener.h
    parser/regexLexer.cpp parser/regexLexer.h
    parser/regexParser.cpp parser/regexParser.h
    parser/regexListener.cpp parser/regexListener.h
    parser/regexBaseListener.cpp parser/regexBaseListener.h
)

add_dependencies(regex antlr4_static)
target_link_libraries(regex antlr4_static)
target_compile_definitions(regex PUBLIC ANTLR4CPP_STATIC)
