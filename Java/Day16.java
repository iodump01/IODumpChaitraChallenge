/*

Day 16: Program to find the kth largest element in the list.

*/

// Program
import java.util.Scanner;
import java.util.Arrays;

public class Day16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        if(k <= n && k > 0){
            int arr[] = new int[n];
            System.out.println("Enter the elements (space seperated): ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.print("Sorted Array: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            int ans = arr[n-k];
        
            System.out.println("Kth largest element in the list is "+ans);
        }else{
            System.out.println("Wrong k value");
        }
        
    }
}

/*

Input/Output:

Enter the number of elements: 
8
Enter the value of k: 
3
Enter the elements (space seperated): 
12 44 5 34 89 1 9 20
Sorted Array: 1 5 9 12 20 34 44 89   
Kth largest element in the list is 34

*/
