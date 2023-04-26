/*

Day 17: Program to find whether s is a substring of str or not using recursion.

*/


//Program
#include <bits/stdc++.h>
using namespace std;

bool isSubstring(string str, string s) {
    if (s.empty()) {
        return true;
    }
    if (str.empty()) {
        return false;
    }
    if (str.substr(0, s.size()) == s) {
        return true;
    }
    return isSubstring(str.substr(1), s);
}

int main() {
    string str;
    string s;

    cout << "Enter the string: ";
    getline(cin, str);
    cout << "Enter the substring: ";
    cin >> s;
    
    if (isSubstring(str, s)) {
        cout << s << " is a substring of: " << str << endl;
    } else {
        cout << s << " is not a substring of: " << str << endl;
    }
    return 0;
}





/*

Input and Output:

Enter the string: This is IODump Chaitra Challenge
Enter the substring: IODump
IODump is a substring of: This is IODump Chaitra Challenge

*/
