/*

Day 26:	Implement a function that takes a string as input and returns the minimum number of insertions required to make the string a palindrome.

*/

//Program
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int min_Insertions_To_Make_Palindrome(const string& str) {
    int n = str.length();
    int dp[n][n];
    std::fill_n(&dp[0][0], n*n, 0);

    for (int gap = 1; gap < n; ++gap) {
        for (int l = 0, r = gap; r < n; ++l, ++r) {
            if (str[l] == str[r]) {
                dp[l][r] = dp[l+1][r-1];
            } else {
                dp[l][r] = min(dp[l+1][r], dp[l][r-1]) + 1;
            }
        }
    }

    return dp[0][n-1];
}

int main() {
    string str;
    cout << "Enter the string: ";
    cin >> str;
    cout << "Minimum number of insertions required to make the string a palindrome:" << min_Insertions_To_Make_Palindrome(str) << endl;
    return 0;
}


/*

Input and Output:
Enter the string: abcdefgg
Minimum number of insertions required to make the string a palindrome:6

*/
