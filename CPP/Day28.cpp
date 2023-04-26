/*

Day 28:	Implement a function that takes a list of strings as input and returns a new list that contains all the strings with the first letter capitalized.

*/

//Program
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

string capitalize(const string& str) {
    if (str.empty()) {
        return str;
    }
    string result = str;
    result[0] = toupper(result[0]);
    return result;
}

vector<string> capitalizeList(const vector<string>& list) {
    vector<string> result;
    for (const auto& str : list) {
        result.push_back(capitalize(str));
    }
    return result;
}

int main() {
    
    vector<string> list = {"hello", "world", "c++", "programming"};
    vector<string> capitalizedList = capitalizeList(list);
    for (const auto& str : capitalizedList) {
        cout << str << " ";
    }
    cout << endl;
    return 0;
}
 

/*

Input and Output:

Hello World C++ Programming

*/
