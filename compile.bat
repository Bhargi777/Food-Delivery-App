@echo off
echo Compiling Java files...
mkdir bin 2>nul
javac -d bin src\Sample\*.java

if %errorlevel% equ 0 (
    echo Compilation successful!
    echo To run the application, use:
    echo java -cp bin Sample.FoodDeliveryApp
) else (
    echo Compilation failed!
)
pause
