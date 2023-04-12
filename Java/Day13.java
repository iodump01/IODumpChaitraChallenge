/*

Day 13: Program to find Fibonacci series of n numbers using recursion.

*/

// Program
import java.util.Scanner;

public class Day13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n to find the fibonacci series upto n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series upto n:");
        int arr[] = new int[n+1];
        fibo(n,arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static int fibo(int n, int[] arr){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            arr[n]= 0;
            return arr[n];
        }
        if( n == 1){
            arr[n]= 1;
            return arr[n];
        }
        if(arr[n] != 0) return arr[n];
        arr[n] = fibo(n-1,arr) + fibo(n-2,arr);
        return arr[n];
    }
}

/*

Input/Output:

Enter n to find the fibonacci series upto n: 
20
Fibonacci Series upto n:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 

*/
