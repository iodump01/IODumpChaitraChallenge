//C++program to check whether the given character is vowel or consonant

#include <iostream>
using namespace std;
int main() {
   char c;
   cout<<"Enter the character: ";
   cin>> c;
   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c== 'A' || c== 'E' || c == 'I' || c == 'O' || c == 'U'){
   cout <<c<< " is a Vowel" << endl;
   }
   else{
   cout <<c<< " is a Consonant" << endl;
   }
   return 0;
}




/*
Input:
   Enter the character: s

Output: 
   s is a Consonant
*/
