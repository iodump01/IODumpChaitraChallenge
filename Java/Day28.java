/*
Day 28: Implement a function that takes a list of strings as input and returns a new list that contains all the strings with the first letter capitalized.
*/

// Program
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number strings: ");
        int n = sc.nextInt();

        String strings[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "th string: ");
            strings[i] = sc.next();
        }

        String[] newStrings = capStrings(strings);
        System.out.println("\nCapitalized Strings are: ");
        for (int i = 0; i < newStrings.length; i++) {
            System.out.println(newStrings[i]);
        }

        sc.close();
    }

    public static String[] capStrings(String[] strings) {
        String[] newStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            newStrings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }
        return newStrings;
    }
}

/*
 * 
 * Enter the number strings:
 * 4
 * Enter 1th string:
 * java
 * Enter 2th string:
 * Hello
 * Enter 3th string:
 * py
 * Enter 4th string:
 * nOTHING
 * 
 * Capitalized Strings are:
 * Java
 * Hello
 * Py
 * NOTHING
 * 
 */