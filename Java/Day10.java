/*

Day 10: Accept the height of a person in cm and convert it to feet.

*/

// Program
import java.util.Scanner;

public class Day10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in cm: ");
        int h = sc.nextInt();
        System.out.println("Height in feet is "+ h*0.0328084);
    }
}

/*

Input/Output:

Enter the height in cm: 
190
Height in feet is 6.233596

*/
