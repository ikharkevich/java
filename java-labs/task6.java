/* This code retrieves the string entered by the user. If the entered string 
 is empty, the program displays an error message and terminates. The code then 
 iterates through each character in the entered string. If the character is a vowel, 
 it is output to the console. The loop continues, checking each vowel, and then 
 repeats for the next character in the input string.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if (s.isEmpty()) {
            System.out.println("String cannot be empty!");
            System.exit(1);
        }

        String vowels = "aeiou";
        for (int j = 0; j < vowels.length(); j++){
            for (int i = 0; i < s.length(); i++){
                if (Character.toLowerCase(s.charAt(i)) == vowels.charAt(j)){
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
