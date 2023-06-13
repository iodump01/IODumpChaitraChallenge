/*

Day 25: Print the following pattern:
         *****
          ***
           *
*/

// Program
import java.util.Scanner;

public class Day25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();

        for(int i = n-1; i >= 0; i--){
            for(int k = 1; k <= n-1-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*

Input/Output:

Enter the number n: 
5
*********
 *******
  *****
   ***
    *

*/
