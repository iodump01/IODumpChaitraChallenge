/*

Day5: Program to find sum of first n even numbers

*/
#include <iostream>
using namespace std;

// Program
int main()
{
	int n, sum=0;
	cout << "Enter the number: " ;
    cin>>n;
    for (int i=1; i<= n; i++){
        if (i % 2 == 0){
            sum= sum+i;
        }

    }
    cout<< "The sum of first " << n << " numbers is: " << sum;
	
	return 0;
}


/*


Input and Output: 
Enter the number: 6
The sum of first 6 numbers is: 12


*/
