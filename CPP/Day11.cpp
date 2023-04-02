/* 

Day11: Program to find length of string without using inbuilt function.


*/ 

//Program
#include<iostream>
#include<string>
using namespace std;
int main()
{
    string str;
    cout << "Enter the String: ";
    getline (cin,str);
    int len=0;
    while (str[len]!='\0')
    {
        len++;
    }
    cout << "String length is: "<< len;
}



/*

Input and Output:
Enter the String: Welcome to IODumpChaitraChallenge
Your Enter String length is: 33

*/
