/*

Day 17:  Program to find whether s is a substring of str or not, using recursion.

*/

// Program
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string str: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring s: ");
        String s = sc.nextLine();
        boolean found = false;

        int substrLength = s.length();
        int strLength = str.length();

        if (substrLength <= strLength) {
            for (int i = 0; i < strLength + 1 - substrLength; i++) {
                String newStr = str.substring(i, i + substrLength);
                if (s.equals(newStr)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(s + " is a substring of " + str);
            } else {
                System.out.println(s + " is not a substring of " + str);
            }
        } else {
            System.out.println(s + " can not be a substring of " + str);
        }
        sc.close();
    }
}

/*
 * 
 * Input/Output:
 * 
 * Enter the string str:
 * racecar
 * Enter the substring s:
 * rae
 * rae is not a substring of racecar
 * 
 */
