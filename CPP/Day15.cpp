/*

Day 15: Program to check whether the given number is palindrome or not

*/

//Program
#include <iostream>
using namespace std;

bool isPalindrome(int num) {
    if (num < 0) {
        return false;
    }
    int rev = 0;
    int original = num;
    while (original > 0) {
        rev = rev * 10 + original % 10;
        original /= 10;
    }
    return num == rev;
}

int main() {
    int num;
    cout<<"Enter the number: ";
    cin >> num;

    if (isPalindrome(num)) {
        cout << num << " is PALINDROME." << endl;
    } 
    else {
        cout << num << " is NOT PALINDROME." << endl;
    }
    return 0;
}




/*


Input & Output:

Enter the number: 123454321
123454321 is PALINDROME.


*/
