/*

Day 23: Implement a function that takes two integers as input and returns their greatest common divisor (GCD).

*/

//Program
#include <iostream>
using namespace std;
// Function to return gcd of a and b
int gcd(int a, int b)
{
    int gcd;
	if ( b > a) {   
    int temp = b;
    b = a;
    a = temp;
  }
    
  for (int i = 1; i <=  b; ++i) {
    if (a % i == 0 && b % i ==0) {
      gcd = i;
    }
  }
  return gcd;
}

// Driver program to test above function
int main()
{
	int a , b;
    cout << "Enter the first number: ";
    cin >> a;

    cout << "Enter the second number: ";
    cin >> b;


	cout << "GCD of " << a << " and " << b << " is "
		<< gcd(a, b);
	return 0;
}


/*

Input and Output:

Enter the first number: 12
Enter the second number: 78
GCD of 12 and 78 is 6

*/
