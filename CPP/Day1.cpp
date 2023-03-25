/*

Day 1: Program to find the largest and smallest of the given 5 numbers.

*/

// Program
#include <iostream>
using namespace std;

int main()
{

    int array[5];
    cout << "Enter 5 numbers space seperated: ";
    for (int i = 0; i < 5; i++)
    {
        cin >> array[i];
    }

    int largest = array[0];
    int smallest = array[0];

    for (int i = 0; i < 5; i++)
    {
        if (largest < array[i])
        {
            largest = array[i];
        }
        if (smallest > array[i])
        {
            smallest = array[i];
        }
    }
    cout << "Largest number is : " << largest << endl;
    cout << "Smallest number is : " << smallest << endl;
    return 0;
}

/*

Input:
Enter 5 numbers space seperated: 4 5 3 2 1

Output:
Largest number is : 5
Smallest number is : 1


*/