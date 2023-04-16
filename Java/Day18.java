/*

Day 18:  Program to sort the elements in the list/ array in ascending order. 

*/

// Program
import java.util.Scanner;
import java.util.Collections;  

public class Day18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements (space seperated): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        
        for(int i = 0; i < n; i++){
            int mini = i;
            for(int j = 0; j < n; j++){
                if(arr[mini] < arr[j]){
                    mini = j;
                }
            }
            swap(arr, i , mini);
        }

        System.out.print("Sorted Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

Input/Output:

Enter the number of elements: 
5
Enter the elements (space seperated): 
18 89 34 3 29
Sorted Array: 18 34 3 29 89 

*/
