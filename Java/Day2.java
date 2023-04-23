/*

Day 2: Program to check whether the given character is vowel or consonant.

*/

// Program
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is a Consonant");
        }

        sc.close();
    }
}

/*
 * 
 * Input:
 * Enter the character:
 * s
 * 
 * Output:
 * s is a Consonant
 * 
 * 
 */