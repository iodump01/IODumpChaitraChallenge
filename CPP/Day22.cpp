/*

Day 22: Write a program to find the first non-repeating character in a string

*/

//Program
#include <bits/stdc++.h>
using namespace std;

int main()
{
	string string;

    cout << "Enter the string: ";
    cin >> string;


	int index = -1;
	char fnc = ' ';
	for (auto i : string) {
		if (count(string.begin(), string.end(), i) == 1) {
			fnc = i;
			break;
		}
		else {
			index = 1;
		}
	}
	if (index == 1) {
		cout << "Either all characters are repeating or "
				"string is empty"
			<< endl;
	}
	else {
		cout << "First non-repeating character is " << fnc
			<< endl;
	}
	return 0;
}


/*

Input and Output:

Enter the string: Surrounding
First non-repeating character is S

*/
