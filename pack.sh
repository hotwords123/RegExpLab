#!/bin/bash
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
cd "$SCRIPT_DIR"

OUTPUT=nfa.zip
TEMP_DIR=./nfa.zip.temp

rm $OUTPUT
mkdir -p $TEMP_DIR/cpp
cp -t $TEMP_DIR/cpp/ *.cpp *.h CMakeLists.txt
cp -t $TEMP_DIR/ README.txt build/nfa.exe
7z a $OUTPUT $TEMP_DIR/*
rm -r $TEMP_DIR
7z l $OUTPUT
