/*

Day 27: Write a program that takes two matrices as input and returns the product of the matrices

*/


//Program
#include <iostream>  
using namespace std;  
int main()  
{  
    int a[10][10],b[10][10],mul[10][10],r,c,i,j,k;    
    cout<<"Enter the number of rows: ";    
    cin>>r;    
    cout<<"Enter the number of columns:";    
    cin>>c;    

    cout << "--------------------------------------------------------------------------------";

    cout<<"\nEnter the first matrix element: \n";    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
        {    
            cin>>a[i][j];  
        }    
    }    
    cout<<"\n\nEnter the second matrix element: \n";    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
        {    
            cin>>b[i][j];    
        }    
    }    
    cout<<"\n\nMultiplication of the matrix: \n";    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
        {    
            mul[i][j]=0;    
                for(k=0;k<c;k++)    
                {    
                    mul[i][j]+=a[i][k]*b[k][j];    
                }    
        }    
    }    


    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
        {    
            cout<<mul[i][j]<<" ";    
        }    
        cout<<"\n";    
    }    
    return 0;  
}    




/*

Input and Output:

Enter the number of rows: 2
Enter the number of columns:2
--------------------------------------------------------------------------------
Enter the first matrix element:
1 2
3 4


Enter the second matrix element:
5 6
7 8


Multiplication of the matrix:
19 22
43 50

*/
