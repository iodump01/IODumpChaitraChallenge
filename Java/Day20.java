/*

Day 20: Implement an algorithm to find nth Fibonacci number 

*/

// Program
import java.util.Scanner;

public class Day20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Can't find the fibonacci number for " + n + "th term.");
        }else if(n < 2){
            System.out.println(n + "th fibonacci number is " + n);
        }else{
            int a = 0, b = 1, ans = 0;
            for(int i = 2; i <= n; i++){
                ans = a+b;
                a = b;
                b = ans;
            }

            System.out.println(n + "th fibonacci number is " + ans);
        }

    }
}

/*

Input/Output:

Enter the number n:
10
10th fibonacci number is 55

*/
