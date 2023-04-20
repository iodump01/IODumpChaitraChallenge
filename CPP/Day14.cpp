/*

Day 14: Taking a and b as user input, print the value of a^b (a raised to b).(Use for loop)


*/ 

//Program
#include <iostream>
using namespace std;
double power(double a, int b) {
    double result = 1.0;
    for (int i = 0; i < b; i++) {
        result *= a;
    }
    return result;
}

int main() {
    double a;
    int b;
    cout<<"Enter the value of a: ";
    cin >> a;
    cout<<"Enter the value of b: ";
    cin >> b;

    double result = power(a, b);
    cout << a << " raised to the power of " << b << " is: " << result << endl;
    return 0;
}
  

  
/*


Input & Output: 

Enter the value of a: 5
Enter the value of b: 4
5 raised to the power of 4 is: 625


*/

