/*

Day 12:  Program to reverse the digits of a given number.

*/

// Program
import java.util.Scanner;

public class Day12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();
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

        System.out.println("Reversed number is "+rnum*(isNegative?-1:1));
        sc.close();
    }
}

/*

Input/Output:

Enter the number to be reversed: 
3342
Reversed number is 2433

*/
