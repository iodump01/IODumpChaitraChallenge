/*

Day 4: Program to find volume of sphere and cylinder.

*/

// Program
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, h;
        double vol;

        System.out.println("\n---------------- Sphere Volume ----------------");
        System.out.println("Enter the radius of sphere: ");
        r = sc.nextInt();
        vol = ((4 / 3) * 3.14 * r * r * r);
        System.out.println(String.format("Volume of given sphere with radius %d is %.3f", r, vol));

        System.out.println("\n---------------- Cylinder Volume ----------------");
        System.out.println("Enter the radius and the height of cylinder: ");
        r = sc.nextInt();
        h = sc.nextInt();
        vol = 3.14 * r * r * h;
        System.out.println(String.format("Volume of given cylinder with radius %d and height %d is %.3f", r, h, vol));

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
