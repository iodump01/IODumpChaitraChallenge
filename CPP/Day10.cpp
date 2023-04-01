/*

Program to accept the height of a person in cm and convert it to feet. 

*/

//Program
#include <iostream>
using namespace std;

int main() {
   float height_cm, height_ft;

   cout << "Enter height in centimeters: ";
   cin >> height_cm;

   height_ft = height_cm / 30.48;

   cout << "Height in feet: " << height_ft << endl;

   return 0;
}


/*

Input and Output:
Enter height in centimeters: 180
Height in feet: 5.90551

*/
