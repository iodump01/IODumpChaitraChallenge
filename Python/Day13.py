""" 

Day 13:	Program to find Fibonacci series of n numbers using recursion.

"""

#Program
def fibo(n):
   if n <= 1:
       return n
   else:
       return(fibo(n-1) + fibo(n-2))

n = int(input("Enter the number: "))

if n <= 0:
   print("Plese enter a positive integer")
else:
   print("Fibonacci sequence:")
   for i in range(n):
       print(fibo(i), end = " ")
       
       
       

"""

Input and Output:

Enter the number: 5
Fibonacci sequence:
0 1 1 2 3

"""