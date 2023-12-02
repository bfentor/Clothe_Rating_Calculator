@echo off
java -version > nul 2>&1
if errorlevel 1 (
	echo Java not found
) else (
	START /min java --module-path Windows\lib\ --add-modules javafx.controls FashionCalc.java
)