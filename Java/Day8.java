/*

Day 8: Program to print multiplication table of a number using for loop.

*/

// Program
import java.util.Scanner;

public class Day8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("%3d X %3d = %3d",n,i,n*i));
        }
    
    }
}

/*

Input/Output:

Enter a number to print its table: 12
 12 X   1 =  12
 12 X   2 =  24
 12 X   3 =  36
 12 X   4 =  48
 12 X   5 =  60
 12 X   6 =  72
 12 X   7 =  84
 12 X   8 =  96
 12 X   9 = 108
 12 X  10 = 120

*/
