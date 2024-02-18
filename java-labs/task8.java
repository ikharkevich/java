/* This code takes the number n entered by the user and creates an array of n elements. It then removes all null elements from the array.

The removeZeros(a) method takes the original array and creates a new array that does not contain any null elements from the original array.

System.arraycopy is not used, instead a simple for loop is used, which makes the code more understandable and manageable.

Please replace Math.random() * 10 with any other code you need to fill the array if this code does not fit your requirements.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Incorrect array size value!");
            System.exit(1);
        }

        double[] a = new double[n];
        System.out.println("Initial array:");
        for (int i = 0; i < n; ++i) {
            a[i] = Math.random() * 10; // Random values for array elements
            System.out.printf("%5.0f ", a[i]);
        }
        System.out.println();

        a = removeZeros(a);

        System.out.println("Array after deleting zeros:");
        for (double el : a) {
            System.out.printf("%5.0f ", el);
        }
        System.out.println();
    }

    public static double[] removeZeros(double[] a) {
        int zeroCount = 0;

        for (double el : a) {
            if (el == 0) {
                zeroCount++;
            }
        }

        double[] result = new double[a.length - zeroCount];
        int resultIndex = 0;

        for (int i = 0; i < a.length; ++i) {
            if (a[i] != 0) {
                result[resultIndex++] = a[i];
            }
        }

        return result;
    }
}
