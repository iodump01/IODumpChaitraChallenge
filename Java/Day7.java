/*

Day 7: Program to check whether the input received from user is prime or not.

*/

// Program
import java.util.Scanner;

public class Day7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether its prime or not: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Given number is a prime number.");
        }else{
            System.out.println("Given number is not a prime number.");
        }

    
    }
}

/*

Input/Output:

Enter the temperature in Fahrenheit: 
34
Temperature in Celcius is 1.1111111111111112

*/
