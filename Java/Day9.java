/*

Day 9: Program to find factorial of given number.

*/

// Program
import java.util.Scanner;

public class Day9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its factorial: ");
        int n = sc.nextInt();
        int f = 1;
        
        for(int i = 1; i <= n; i++){
            f *= i;
        }
    
        System.out.println(String.format("Factorial of %d is %d",n,f));
    }
}

/*

Input/Output:

Enter a number to print its factorial: 23
Factorial of 23 is 862453760

*/
