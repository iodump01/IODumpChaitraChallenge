/*

Day 11: Program to find length of string without using inbuilt function.

*/

// Program
import java.util.Scanner;

public class Day11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count the length: ");
        String s = sc.nextLine();
        int i = 0;
        // Method 1
        // try{
        //     while(s.charAt(i) != '\0'){
        //         i++;
        //     }
        // }catch(IndexOutOfBoundsException e){
        //     System.out.println("Length of the string is "+i);
        // }

        // Method 2
        s += '\0';
        while(s.charAt(i) != '\0'){
            i++;
        }
        System.out.println("Length of the string is "+i);
    }
}

/*

Input/Output:

Enter the height in cm: 
190
Height in feet is 6.233596

*/
