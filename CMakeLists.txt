cmake_minimum_required(VERSION 3.15)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

list(APPEND CMAKE_MODULE_PATH ${PROJECT_SOURCE_DIR}/lib/antlr)
set(ANTLR4_ZIP_REPOSITORY ${PROJECT_SOURCE_DIR}/lib/antlr/antlr4-cpp-runtime-4.12.0-source.zip)
include(ExternalAntlr4Cpp)
message(STATUS "Found antlr4 static libs: ${ANTLR4_STATIC_LIBRARIES} and includes: ${ANTLR4_INCLUDE_DIRS} ")

if(MINGW)
    add_link_options(-static -static-libgcc -static-libstdc++)
endif()
add_compile_options("$<$<C_COMPILER_ID:MSVC>:/utf-8>")
add_compile_options("$<$<CXX_COMPILER_ID:MSVC>:/utf-8>")

add_executable(nfa main-nfa.cpp nfa.cpp nfa.h nfa-executor.cpp nfa-executor.h utils.h)

add_executable(regex main-regex.cpp nfa.cpp nfa.h utils.h regex.cpp regex.h
        parser/regexLexer.cpp parser/regexParser.cpp parser/regexBaseListener.cpp parser/regexListener.cpp)
add_dependencies(regex antlr4_static)
target_include_directories(regex PUBLIC ${ANTLR4_INCLUDE_DIRS})
target_link_libraries(regex antlr4_static)
