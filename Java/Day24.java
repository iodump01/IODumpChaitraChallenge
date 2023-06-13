/*

Day 24: Write a program that takes a list of integers as input and returns a new list that contains only the elements that appear more than once in the original list.
*/

// Program
import java.util.*;

public class Day24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements (space seperated): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> newarr = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            boolean haveMore = false;
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    haveMore = true;
                    break;
                }
            }
            if(haveMore){
                if(newarr.indexOf(arr[i]) == -1){
                    newarr.add(arr[i]);
                }
            }
        }

        System.out.print("Output Array: " + newarr);
        sc.close();
    }
}

/*

Input/Output:

Enter the number of elements: 
10
Enter the elements (space seperated): 
1 2 3 4 2 3 4 2 4 2 
Output Array: [2, 3, 4]

*/
