/* The user enters a number. If the entered number is one of the defined 
 values (9583, 1747, and so on), the defined code is executed. If the number 
 is not in the list, the message "Not defined" is displayed. If the input 
 is not a number, an error message is output and the program is terminated 
 with an exit code of 1, which usually signals an unsuccessful program termination.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = null;

        double x = 0;

        try {
            scanner = new Scanner(System.in);
            x = scanner.nextDouble();
        } catch(Exception e) {
            System.out.println("Input can only be a number!");
            System.exit(1);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        if (x == 9583 || x == 1747) {
            System.out.println("Defined level for A,B,C");
        } else if (x == 3331 || x == 7922) {
            System.out.println("Defined level for B,C");
        } else if (x == 9455 || x == 8997) {
            System.out.println("Defined level for C");
        } else {
            System.out.println("Not defined");
        }
    }
}