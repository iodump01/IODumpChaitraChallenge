/*

Day 14: Taking a and b as user input, print the value of a^b (a raised to b) - (Use for loop)

*/

// Program
import java.util.Scanner;

public class Day14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b (space seperated): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isneg = false;

        if(b < 0){
            isneg = true;
            b *= -1;
        }

        float ans = 1;
        for(int i = 0; i < b; i++){
            ans *= a;
        }

        if(isneg){
            ans = 1/ans;
        }

        System.out.println("a^b gives "+ans);
        
    }
}

/*

Input/Output:

Enter a and b (space seperated): 
3 -2
a^b gives 0.11111111

*/
