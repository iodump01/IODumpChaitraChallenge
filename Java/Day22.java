/*

Day 22: Write a program to find the first non-repeating character in a string.

*/

// Program
import java.util.*;


public class Day22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string s: ");
        String s = sc.nextLine();

        HashMap<Character,Integer> prefix = new HashMap<>();


        for(int i = 0; i < s.length(); i++){
            // if(!prefix.containsKey(s.charAt(i))){
            //     prefix.put(s.charAt(i),0)
            // }
            // prefix.put(s.charAt(i),prefix.get(s.charAt(i))+1);
            prefix.put(s.charAt(i), prefix.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(prefix.get(s.charAt(i)) == 1){
                System.out.println(s.charAt(i) + " is the first character to be non repeating!");
                break;
            }
        }

    }
}

/*

Input/Output:

Enter a string s: 
Hello Hey
o is the first character to be non repeating!

*/
