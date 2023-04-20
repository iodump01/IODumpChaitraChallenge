/*

Day 13: Program to find Fibonacci series of n numbers using recursion.

*/

//Program
#include <bits/stdc++.h>
using namespace std;
int fib(int n) {
    if (n <= 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}

int main() {
    int n;
    cout<<"Enter the number: ";
    cin >> n;

    cout<<"Fibonacci series of " << n <<" is: \n";
    for (int i = 0; i < n; i++) {
        cout << fib(i) << " ";
    }
    cout << endl;
    return 0;
}



/*


Input & Output: 

Enter the number: 20
Fibonacci series of 20 is:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

*/
