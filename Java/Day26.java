/*
Day 26: Implement a function that takes a string as input and returns the minimum number of insertions required to make the string a palindrome.
*/

// Program
import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        System.out.println(
                "We would need " + cntInsertion(str, 0, str.length()) + " insertions to make the string palindrome.");

        sc.close();
    }

    public static int cntInsertion(String str, int s, int e) {
        if (s >= e || s + 1 == e) {
            return 0;
        }

        if (str.charAt(s) == str.charAt(e - 1)) {
            return cntInsertion(str, s + 1, e - 1);
        } else {
            return 1 + cntInsertion(str, s + 1, e);
        }

    }
}

/*
 * 
 * Enter the string:
 * abbaba
 * We would need 1 insertions to make the string palindrome.
 * 
 */