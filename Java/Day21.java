/*

Day 21:  Implement a function to check if a given string contains vaild email address.

*/

// Program
import java.util.Scanner;

public class Day21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email address: ");
        String email = sc.next();
        boolean isValid = true;

        int atpos = email.indexOf("@");
        int ldotpos = email.lastIndexOf(".");
        if(atpos == -1 || atpos < email.lastIndexOf("@")){
            // at should be present and only single atpos should be present
            isValid = false;
        }
        if(ldotpos-1 <= atpos){
            // last dot position should be greater that at position by atleast one char
            isValid = false;
        }

        if(isValid){
            System.out.println("Given email ("+ email + ") is a valid email.");
        }else{
            System.out.println("Given email ("+ email + ") is not a valid email.");
        }
        sc.close();
    }
}

/*

Input/Output:

Enter the email address: 
pran.10@gmail.com 
Given email (pran.10@gmail.com) is a valid email.

*/
