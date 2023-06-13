/*

Day 5: Program to print sum of first n numbers.

*/

// Program
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of all the numbers upto " + n + " is " + sum);

        sc.close();
    }
}

/*
 * 
 * Input/Output:
 * 
 * ---------------- Sphere Volume ----------------
 * Enter the radius of sphere:
 * 4
 * Volume of given sphere with radius 4 is 200.960
 * 
 * ---------------- Cylinder Volume ----------------
 * Enter the radius and the height of cylinder:
 * 3 5
 * Volume of given cylinder with radius 3 and height 5 is 141.300
 * 
 */
