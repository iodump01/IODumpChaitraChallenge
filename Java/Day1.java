/*

Day 1: Program to find the largest and smallest of the given 5 numbers.

*/

// Program
import java.util.Scanner;

public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = 5;
        // int[] arr = {1,2,3,4,5};
        int n = 5;
        int[] arr = new int[n];

        System.out.print("Enter 5 numbers space seperated: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        int maxVal = arr[0];

        for(int i = 0; i < n; i++){
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }

        System.out.println("Largest number is : "+maxVal+"\n"+"Smallest number is : "+minVal);
    }
}

/*

Input:
Enter 5 numbers space seperated: 4 5 3 2 1

Output:
Largest number is : 5
Smallest number is : 1


*/