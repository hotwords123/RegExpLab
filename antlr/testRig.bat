@echo off

set JAVA=java
set JAVAC=javac
set ANTLR_JAR=antlr-4.12.0-complete.jar
set CLASS_OUTPUT_PATH=parser-classes

cd /D "%~dp0"
%JAVAC% -cp %ANTLR_JAR% parser/*.java -d %CLASS_OUTPUT_PATH% || exit /b
echo ������Ҫ�������ַ��������������ر�������(Linux\Mac�°�2��Ctrl+D��Windows�»س���Ctrl+Z�ٻس�)��
%JAVA% -cp %ANTLR_JAR%;%CLASS_OUTPUT_PATH% org.antlr.v4.gui.TestRig regex regex -gui -tokens || exit /b
