#!/usr/bin/bash
set -e

JAVA="java"
JAVAC="javac"
ANTLR_JAR="antlr-4.12.0-complete.jar"
CLASS_OUTPUT_PATH="parser-classes"

cd "$(dirname $0)"

if ! diff regex.g4 "$CLASS_OUTPUT_PATH/regex.g4"; then
  echo "cleaning old parser classes"
  rm -r $CLASS_OUTPUT_PATH
fi

if [ ! -d $CLASS_OUTPUT_PATH ]; then
  echo "compiling parser classes"
  mkdir $CLASS_OUTPUT_PATH
  cp regex.g4 "$CLASS_OUTPUT_PATH/"
  $JAVAC -cp $ANTLR_JAR parser/*.java -d $CLASS_OUTPUT_PATH
fi

read -p "Input regex: " -r input
printf "%s" $input | $JAVA -cp "$ANTLR_JAR;$CLASS_OUTPUT_PATH" org.antlr.v4.gui.TestRig regex regex -gui -tokens
