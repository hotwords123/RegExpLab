#!/bin/bash
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
cd "$SCRIPT_DIR"

OUTPUT=regex.zip
TEMP_DIR=./regex.zip.temp

rm $OUTPUT
mkdir -p $TEMP_DIR/cpp
cp -r -t $TEMP_DIR/cpp/ *.cpp *.h CMakeLists.txt parser/ lib/
strip build/regex.exe
cp -t $TEMP_DIR/ README.txt build/regex.exe antlr/regex.g4 document.pdf
7z a $OUTPUT $TEMP_DIR/*
rm -r $TEMP_DIR
7z l $OUTPUT
