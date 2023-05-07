#!/usr/bin/bash
set -e

JAVA="java"
JAVAC="javac"
ANTLR_JAR="antlr-4.12.0-complete.jar"
CLASS_OUTPUT_PATH="parser-classes"

cd "$(dirname $0)"
if [ ! -d $CLASS_OUTPUT_PATH ]; then
  $JAVAC -cp $ANTLR_JAR parser/*.java -d $CLASS_OUTPUT_PATH
fi

read -p "Input regex: " -r input
printf "%s" $input | $JAVA -cp "$ANTLR_JAR;$CLASS_OUTPUT_PATH" org.antlr.v4.gui.TestRig regex regex -gui -tokens
