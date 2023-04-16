/*

Day 23: Implement a function that takes two integers as input and returns their greatest common divisor (GCD).

*/

// Program
import java.util.Scanner;

public class Day23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();

        for(int i = Math.max(a,b); i > 0; i--){
            if(a%i == 0 && b%i == 0){
                System.out.println(String.format("gcd(%d,%d) = %d",a,b,i));
                break;
            }
        }

    }
}

/*

Input/Output:

Enter the number a: 
15
Enter the number b: 
30
gcd(15,30) = 15

*/
