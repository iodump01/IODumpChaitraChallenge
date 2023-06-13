/*

Day 3: Program to find the area of a triangle, rectangle, and square.

*/

// Program
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double area;

        System.out.println("\n---------------- Triangle Area ----------------");
        System.out.println("Enter the 3 sides of Triangle (space seperated): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        area = ((0.25) * (Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c))));
        System.out.println(String.format("Area of given triangle with sides %d %d %d is %.3f", a, b, c, area));

        System.out.println("\n---------------- Rectangle Area ----------------");
        System.out.println("Enter the 2 sides of Rectangle (space seperated): ");
        a = sc.nextInt();
        b = sc.nextInt();
        area = a * b;
        System.out.println(String.format("Area of given rectangle with sides %d %d is %.3f", a, b, area));

        System.out.println("\n---------------- Square Area ----------------");
        System.out.println("Enter the sides of Square: ");
        a = sc.nextInt();
        area = a * a;
        System.out.println(String.format("Area of given Square with sides %d is %.3f", a, area));

        sc.close();
    }
}

/*
 * 
 * Input/Output:
 * 
 * ---------------- Triangle Area ----------------
 * Enter the 3 sides of Triangle (space seperated):
 * 21 34 44
 * Area of given triangle with sides 21 34 44 is 346.795
 * 
 * ---------------- Rectangle Area ----------------
 * Enter the 2 sides of Rectangle (space seperated):
 * 3 2
 * Area of given rectangle with sides 3 2 is 6.000
 * 
 * ---------------- Square Area ----------------
 * Enter the sides of Square:
 * 43
 * Area of given Square with sides 43 is 1849.000
 * 
 * 
 */
