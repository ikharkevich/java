/* Description of what happens: In this program, the user is prompted to enter 
 three radii. If all three radii are equal, the message "All three radii are equal"
 is displayed. Otherwise, the message "The radii are not equal" is output. If the 
 user input is not a number, the program displays the error message "Input can only 
 be a number!" and then terminates with status 1.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = 0, r2 = 0, r3 = 0;

        try {
            System.out.println("Enter the radius of the first circle:");
            r1 = scanner.nextInt();
            System.out.println("Enter the radius of the second circle:");
            r2 = scanner.nextInt();
            System.out.println("Enter the radius of the third circle:");
            r3 = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Input can only be a number!");
            System.exit(1);
        } finally {
            scanner.close();
        }

        if (r1 == r2 && r2 == r3) {
            System.out.println("All three radii are equal");
        } else {
            System.out.println("The radii are not equal");
        }
    }
}
