
/* This code asks the user for two values: an integer n representing the number of sides 
 of a regular polygon, and a real number r representing the radius of the circumcircle 
 of that polygon. It then calculates and outputs the polygon's side length, perimeter, 
 and area. At the end of the code, the scanner resource is released using the .close() method.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides n:");
        int n = scanner.nextInt();
        System.out.println("Enter the radius R:");
        double r = scanner.nextDouble();
        
        // Calculating the side length of a regular polygon
        double a = 2 * r * Math.tan(Math.PI/n);
        
        // Calculating the perimeter (equal to the length of a side multiplied by the number of sides)
        double p = a * n;
        
        // Calculating area
        double s = n * r * a / 2;
        
        System.out.println("Area = " + s);
        System.out.println("Perimeter = " + p);
        
        scanner.close();
    }
}
