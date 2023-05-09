#!/bin/bash
set -e

JAVA="java"
ANTLR_JAR="antlr-4.12.0-complete.jar"
ANTLR_COMMAND="$JAVA -jar $ANTLR_JAR"
GRAMMAR_FILE="regex.g4"

cd "$(dirname $0)"

$ANTLR_COMMAND -o parser $GRAMMAR_FILE
$ANTLR_COMMAND -Dlanguage=Cpp -o ../parser $GRAMMAR_FILE
# $ANTLR_COMMAND -Dlanguage=Python3 -o ../python/parser $GRAMMAR_FILE

rm -r parser-classes
