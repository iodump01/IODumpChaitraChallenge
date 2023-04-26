/*

Day 29:	Write a program that reads in a file and prints out the number of lines, words, and characters in the file.

*/

//Program
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    string filename;
    cout << "Enter filename: ";  
    cin >> filename;

    ifstream file(filename);
    if (!file.is_open()) {
        cerr << "Failed to open file: " << filename << endl;
        return 1;
    }

    int line_count = 0, word_count = 0, char_count = 0;
    string line;
    while (getline(file, line)) {
        line_count++;
        char_count += line.length();
        bool in_word = false;
        for (char c : line) {
            if (isspace(c)) {
                if (in_word) {
                    word_count++;
                    in_word = false;
                }
            } else {
                in_word = true;
            }
        }
        if (in_word) {
            word_count++;
        }
    }
    file.close();

    cout << "Lines: " << line_count << endl;
    cout << "Words: " << word_count << endl;
    cout << "Characters: " << char_count << endl;

    return 0;
}


/*

Input and Output:

Enter filename: IODump.txt
Lines: 5
Words: 24
Characters: 128

*/
