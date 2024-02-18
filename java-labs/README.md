# Java Exercises

This repository contains solutions for several exercises.

## Task 1
A program that takes user input with a `Scanner`. The scanner is initialized as `null` before the `try`-block, and then closed within the `finally`-block. This ensures that the `Scanner` closes correctly in any situation, even if an exception is thrown.

## Task 2
A program that prompts the user for two values: an integer `n` representing the number of sides of a regular polygon, and a real number `r` representing the radius of the circumcircle of that polygon. It then calculates and outputs the side length, perimeter, and area of the polygon. At the end of the program, the `Scanner` is released using the `.close()` method.

## Task 3
In this program, the user enters a number. The code checks if this number matches a predefined set of values (9583, 1747, etc). If a match is found, a specific code executes. If the number does not match any predefined value, the message "Not defined" is printed. If the input is not a number, the program displays an error message and terminates with an exit code of `1`.

## Task 4
This program prompts the user to enter the radius of three circles. If all three radii are equal, it prints "All three radii are equal". If not, it prints "The radii are not equal". If the input is not a number, the program prints an error message "Input can only be a number!" and then terminates with status `1`.

## Task 5
This program prompts the user for a text string, then breaks it into individual words. It modifies the words by replacing the first occurrence of a specified character with another and truncating the rest of the word. The modified words are then printed out. If the input is empty, the program prints an error message and terminates.

## Task 6
This program accepts a string input from the user. It goes through each character in the string, checking for vowels. If the character is a vowel, it is printed out. If the input is empty, the program prints an error message and terminates.

## Task 7
A 2D matrix program that prompts the user for the size of a matrix. It then identifies the maximum and minimum elements on the main and secondary diagonals. If the input data is not a number, an error message is printed and the program terminates.

## Task 8
This program retrieves the number `n` entered by the user and creates an array of `n` elements. It then removes all zero elements from the array.

To run each program, navigate to the appropriate directory and then compile and run the Java file.

## Note
These exercises are basic problems for practicing Java. They are excellent for beginners to better understand loops, conditionals, input/output operations, string operations, working with matrices, and working with arrays.

For each exercise, please review the code for details.

## Requirements
* Java SE 11 or later

## Contributors
* ikharkevich

## License
This project is licensed under the MIT License.
