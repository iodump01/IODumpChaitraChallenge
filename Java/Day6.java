/*

Day 6: Program to convert given temperature from Fahrenheit to Celsius.

*/

// Program
import java.util.Scanner;

public class Day6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        int f = sc.nextInt();
        System.out.println("Temperature in Celcius is "+ ((f-32)/1.8));
    
    }
}

/*

Input/Output:

Enter the temperature in Fahrenheit: 
34
Temperature in Celcius is 1.1111111111111112

*/
