/*

Day 15:  Program to check whether the given number is palindrome or not.

*/

// Program
import java.util.Scanner;

public class Day15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int anum = sc.nextInt();
        int num = anum;
        boolean isNegative = false;

        if(num < 0){
            isNegative = true;
            num *= -1;
        }

        int rnum = 0;

        while(num > 0){
            rnum = rnum*10 + num%10;
            num = num/10;
        }
        rnum = rnum*(isNegative?-1:1);

        if(anum == rnum){
            System.out.println("Given number is a palindrome number.");
        }else{
            System.out.println("Given number is not a palindrome number.");
        }
        
    }
}

/*

Input/Output:

Enter the number to be reversed:
-223
Given number is not a palindrome number.
*/
