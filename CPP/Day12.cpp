/*

Day 12: Program to reverse the digits of given number.

*/ 


//Program
#include <iostream>
using namespace std;

int reverseNumber(int n) {
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    return rev;
}

int main() {
    int n;
    cout<<"Enter the number to be reversed: ";
    cin >> n;
    int rev = reverseNumber(n);
    cout << "The reversed number is: " << rev << endl;
    return 0;
}



/*

Input & Output:

Enter the number to be reversed: 12344
The reversed number is: 44321

*/
