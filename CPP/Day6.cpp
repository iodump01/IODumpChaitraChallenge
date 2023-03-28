/*

Day6: Program to check if the input recieved from user is prime or not

*/

//Program
#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter number: ";
    cin>>n;
    if(n==2 || n==3 || n==5 || n==7)
    {
        cout<<"\nThe number is prime";
    }
    else if(n%2==0 || n%3==0 || n%5==0 || n%7==0 )
    {
        cout<<"\nThe number is not prime";
    }
    else
    {
        cout<<"\nThe number is prime";
    }

    return 0;
}



/*


Input an Output:
Enter number: 199

The number is prime


*/
