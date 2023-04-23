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
        sc.close();
    }
}

/*

Input/Output:

Enter the string to count the length: 
Hello Hi check the length of this string.
Length of the string is 41

*/
