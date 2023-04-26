/*

Day 25:	Print the following pattern:
            * * * * *
             * * *
               *
*/


//Program
#include <iostream>
using namespace std;

int main() {

    int rows= 3;

    for(int i = rows; i >= 1; --i) {
        for(int space = 0; space < rows-i; ++space)
            cout << "  ";

        for(int j = i; j <= 2*i-1; ++j)
            cout << "* ";

        for(int j = 0; j < i-1; ++j)
            cout << "* ";

        cout << endl;
    }

    return 0;
}



/*

Output:

* * * * *
  * * *
    *

*/
