/* This code reads a line of text entered by the user and then breaks 
 it down into individual words. In each word the program looks for the 
 first occurrence of the character 'A' (change this letter in the code 
 to the one you need to find), if found, this letter is replaced with 'B' 
 (can also be changed in the code) and the entire word after this letter 
 is trimmed. The modified words are then output to the console. If the 
 entered string is empty, the program displays an error message and terminates.
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

        String[] words= s.split(" ");

        for(String word : words) {
            int apos = word.indexOf('A'); // replace 'A' with the letter you are looking for
            if (apos >= 0){
                word = word.replaceFirst("A","B"); // replace 'A' and 'B' with the letters you want to replace
                word = word.substring(0,apos+1);
            }
            System.out.print(word+" ");
        }
    }
}
