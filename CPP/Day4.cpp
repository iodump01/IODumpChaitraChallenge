/*

Day4: Program to find volume of sphere and cylinder 

*/


//Program
#include <iostream>
using namespace std;

    int main()
    { 
    	int radius, radius_of_cylinder, height;
    	float vol_0f_a_sphere, vol_of_a_cylinder;

        cout << "-------------SPHERE-------------" << endl;	
        cout << "Enter the radius of a sphere :";
    	cin >> radius;

        vol_0f_a_sphere=(4 * 3.14 * radius * radius * radius) / 3; // formula of volume of a sphere
        cout<<"The volume of a sphere is :"<< vol_0f_a_sphere << endl;
        cout<< endl;

        cout<<"-------------CYLINDER-------------" << endl;	
    	cout << "Enter the radius of a cylinder :";
    	cin >> radius_of_cylinder;
    	cout << "Enter the height of a cylinder :";
    	cin >> height;

        vol_of_a_cylinder=(3.14 * radius_of_cylinder * radius_of_cylinder * height);  //formula of volume of a cylinder
        cout << "\nThe volume of a cylinder is :"<< vol_of_a_cylinder;
    
    	return 0;
    }

/* 


Input and Output:

-------------SPHERE-------------
Enter the radius of a sphere :22
The volume of a sphere is :44579.6

-------------CYLINDER-------------
Enter the radius of a cylinder :40
Enter the height of a cylinder :50

The volume of a cylinder is :251200 


*/
