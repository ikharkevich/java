/* This code creates a two-dimensional array and searches for the minimum 
 and maximum elements in the main and side diagonals. The program outputs the 
 matrix and the obtained minimum and maximum values. If the input data is not 
 a number, the program displays an error message and terminates.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix:");
        int n = scanner.nextInt();
        scanner.close();

        double[][] a = { 
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 5, 4, 5},
            {1, 1, 3, 1, 5},
            {1, 2, 3, 4, 5}
        };

        if (n != a.length || n != a[0].length ) {
            System.out.println("The dimensionality introduced does not correspond to the dimensionality of the matrix.");
            System.exit(1);
        }

        System.out.println("2D Array:");
        for (int i = 0 ; i < n; ++i) {
            for (int j = 0 ; j < n; ++j) {
                System.out.printf("%5.2f ", a[i][j]);
            }
            System.out.println();
        }

        int maxi = 0, mini = 0, maxpi = 0, minpi = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[maxi][maxi] < a[i][i]) {
                maxi = i;
            }
            if (a[mini][mini] >= a[i][i]) {
                mini = i;
            }
            if (a[minpi][n-minpi-1] > a[i][n-i-1]) {
                minpi = i;
            }
            if (a[maxpi][n-maxpi-1] <= a[i][n-i-1]) {
                maxpi = i;
            }
        }
        
        System.out.printf("The maximum element of the main diagonal is a[%d][%d]=%5.2f\n", maxi+1, maxi+1, a[maxi][maxi]);
        System.out.printf("The minimum element of the side diagonal is a[%d][%d]=%5.2f\n", minpi+1, n-minpi, a[minpi][n-minpi-1]);
        System.out.printf("The minimum element of the main diagonal is a[%d][%d]=%5.2f\n", mini+1, mini+1, a[mini][mini]);
        System.out.printf("The maximum element of the side diagonal is a[%d][%d]=%5.2f\n", maxpi+1, n-maxpi, a[maxpi][n-maxpi-1]);
    }
}
