/*

Day 19:  Take a character ( uppercase,lowercase,numbers,special characters) and print wheather the character is uppercase,lowercase,number or a special character.

*/

// Program
import java.util.Scanner;

public class Day19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string s: ");
        String s = sc.nextLine();


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int charcode = (int)c;
            // System.out.println((int)c);
            if(charcode >= 65 && charcode <= 65 + 25){
                System.out.println(c + " is uppercase character.");
            }
            else if(charcode >= 97 && charcode <= 97 + 25){
                System.out.println(c + " is lowercase character.");
            }
            else if(charcode >= 48 && charcode <= 48 + 9){
                System.out.println(c + " is a number.");
            }else{
                System.out.println(c + " is a special character.");
            }
        }
    }
}

/*

Input/Output:

Enter a string s: 
Hey There! Java is gr8.  
H is uppercase character.
e is lowercase character.
y is lowercase character.
  is a special character.
T is uppercase character.
h is lowercase character.
e is lowercase character.
r is lowercase character.
e is lowercase character.
! is a special character.
  is a special character.
J is uppercase character.
a is lowercase character.
v is lowercase character.
a is lowercase character.
  is a special character.
i is lowercase character.
s is lowercase character.
  is a special character.
g is lowercase character.
r is lowercase character.
8 is a number.
. is a special character.

*/
