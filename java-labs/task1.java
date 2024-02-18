/* In this version of the code, the scanner is assigned null before 
 the try block and then closed in the finally block. This ensures 
 that the scanner always closes correctly, even if an exception occurs.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of x:");
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            
            if (x == 2 || x == 6) 
                System.out.println("Error on zeros");
            else {
                double y = (x * x - 7 * x + 10) / (x * x - 8 * x + 12);
                System.out.println("F(x) = " + y);
            }
        } catch (ArithmeticException e) {
            System.out.println("There's been an arithmetic error");
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
