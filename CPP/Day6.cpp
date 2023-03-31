/*

Day6: Program to convert given temperature from Fahrenheit to Celsius.

*/



//Program
#include <iostream>
using namespace std;
  
int main() {
    float fahren, celsius;
  
    cout << "Enter the temperature in Fahrenheit: ";
    cin >> fahren;
     
    celsius = 5 * (fahren - 32) / 9;
    cout << fahren <<" Fahrenheit is equal to " << celsius <<" Centigrade";
      
    return 0;
}





/*


Input and Output:
Enter the temperature in Fahrenheit: 20
20 Fahrenheit is equal to -6.66667 Centigrade


*/
