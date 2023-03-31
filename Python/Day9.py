"""
Day9: Program to find factorial of given number

"""


#Program
n = int(input("Enter a number: "))

factorial = 1
if n < 0:
   print("Sorry, factorial does not exist for negative nbers")
elif n == 0:
   print("The factorial of 0 is 1")
else:
   for i in range(1, n+1):
       factorial = factorial*i
   print("The factorial of",n,"is",factorial)
   
   
"""

Input:
Enter a number: 5

Output:
The factorial of 5 is 120


"""
