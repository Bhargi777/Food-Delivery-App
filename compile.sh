#!/bin/bash
# Compilation script for Food Delivery App

echo "Compiling Java files..."
mkdir -p bin
javac -d bin src/Sample/*.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "To run the application, use:"
    echo "java -cp bin Sample.FoodDeliveryApp"
else
    echo "Compilation failed!"
fi
