/*

Day 19: Take a character (uppercase, lowercase, numbers, special characters) and print whether the character is an uppercase alphabet, lowercase alphabet, number or a special character.

*/

// Program
#include <bits/stdc++.h>
using namespace std;
  
void check(char ch)
{
  
    if (ch >= 'A' && ch <= 'Z')
        cout << ch << " is an UpperCase character\n";
  
    else if (ch >= 'a' && ch <= 'z')
        cout << ch << " is an LowerCase character\n";
  
    else if (ch >= '0' && ch <= '9')
        cout << ch << " is a digit\n";

    else
        cout << ch << " is a special character";
}
  
// Driver Code
int main()
{
    char ch;
  
    cout << "Enter the character: ";
    cin >> ch;

    check(ch);
  
    return 0;
}




/*

Input and Output: 

Enter the character: J
J is an UpperCase character

*/
