//Q3. Program to find Area of Triangle, Rectangle and Square.
#include<iostream>
using namespace std;

int main(){
    float sq, rect_len, rect_breadth, tri_base, tri_height;
    float area1, area2, area3;

    cout<<"------------------TRIANGLE------------------";
    cout<<"\nEnter the sides of triangle: "<<endl;
    cin>> tri_base >> tri_height;
    area1= 0.5*tri_base * tri_height;
    cout<<"Area= "<< area1<< endl;

    cout<<"------------------RECTANGLE------------------";
    cout<<"\nEnter the sides of rectangle: "<<endl;
    cin>> rect_len >> rect_breadth;
    area2= rect_len*rect_breadth;
    cout<<"Area = "<< area2 <<endl;

    cout<<"------------------SQUARE------------------";
    cout<<"\nEnter the side of square: "<<endl;
    cin>> sq;
    area3= sq*sq;
    cout<<"Area= "<<area3 <<endl;


    return 0;

}

/* INPUT and OUTPUT: 
------------------TRIANGLE------------------
Enter the sides of triangle: 
45.5
50
Area= 1137.5
------------------RECTANGLE------------------
Enter the sides of rectangle: 
22
60
Area = 1320
------------------SQUARE------------------
Enter the side of square: 
10.56
Area= 111.514 */
