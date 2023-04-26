/*

Day 20: Implement an algorithm to find the nth Fibonacci number.

*/ 

//Program
#include<bits/stdc++.h>
using namespace std;

int fib(int n)
{
	int a = 0, b = 1, c, i;
	if( n == 0)
		return a;
	for(i = 2; i <= n; i++)
	{
	c = a + b;
	a = b;
	b = c;
	}
	return b;
    
}

// Driver code
int main()
{
	int n;
    cout << "Enter the number: ";
	cin >> n;

    cout << "The Fibonacci Series: " ;

	cout << fib(n);

	return 0;
}



/*

input and Output:

Enter the number: 7
The Fibonacci Series: 13

*/
