/*

Day9: Program to find factorial of given number

*/


//Program
#include <iostream>
using namespace std;

int main()
{
    int n, fact=1;
    cout << "Enter a number: ";
    cin >> n;
    for(int i=1; i<=n; i++)
    {
        fact = fact * i;
    }
    cout<< "Factorial of "<< n << " is "<< fact << endl;

    return 0;
}


/*

Input and Output: 

Enter a number: 6
Factorial of 6 is 720


*/
