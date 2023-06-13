/*
Day 27: Write a program that takes two matrices as input and returns the product of the matrices. 
*/
 
// Program
import java.util.Scanner;
 
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and col for mat1 (space seperated): ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
 
        int[][] mat1 = new int[m1][n1];
 
        System.out.println("Enter mat1 elements (space sperated):");
        for (int i = 0; i < m1; i++) {
            // rows
            for (int j = 0; j < n1; j++) {
                // col
                mat1[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("\nEnter the number of rows and col for mat2 (space seperated): ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
 
        int[][] mat2 = new int[m2][n2];
 
        System.out.println("Enter mat1 elements (space sperated):");
        for (int i = 0; i < m2; i++) {
            // rows
            for (int j = 0; j < n2; j++) {
                // col
                mat2[i][j] = sc.nextInt();
            }
        }
 
        if (n1 != m2) {
            System.out.println(
                    String.format("Can't Multiply the given Matrix becaause col num (%d) != row num (%d)", n1, m2));
        } else {
            // matrix prod
            int[][] ans = new int[m1][n2];
 
            for (int i = 0; i < m1; i++) {
                // rows
                for (int j = 0; j < n2; j++) {
                    // col
                    for (int k = 0; k < n1; k++) {
                        ans[i][j] += (mat1[i][k] * mat2[k][j]);
                        // printMatrix(ans, m1, n2);
                    }
                }
            }
 
            System.out.println("\nProduct of matrix product gives: ");
            printMatrix(ans, m1, n2);
 
        }
 
        sc.close();
 
    }
 
    public static void printMatrix(int[][] mat, int row, int col) {
        // Printing the matrix
 
        for (int i = 0; i < row; i++) {
            // rows
            for (int j = 0; j < col; j++) {
                // col
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
 
/*
 * 
 * Enter the number of rows and col for mat1 (space seperated):
 * 2 2
 * Enter mat1 elements (space sperated):
 * 1 2 3 4
 * 
 * Enter the number of rows and col for mat2 (space seperated):
 * 2 2
 * Enter mat1 elements (space sperated):
 * 5 6 7 8
 * 19 22
 * 43 50
 * 
 */