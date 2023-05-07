@echo off

set JAVA=java
set JAVAC=javac
set ANTLR_JAR=antlr-4.12.0-complete.jar
set CLASS_OUTPUT_PATH=parser-classes

cd /D "%~dp0"
%JAVAC% -cp %ANTLR_JAR% parser/*.java -d %CLASS_OUTPUT_PATH% || exit /b
echo 请输入要解析的字符串，输入完后请关闭输入流(Linux\Mac下按2次Ctrl+D，Windows下回车再Ctrl+Z再回车)：
%JAVA% -cp %ANTLR_JAR%;%CLASS_OUTPUT_PATH% org.antlr.v4.gui.TestRig regex regex -gui -tokens || exit /b
