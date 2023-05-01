"""

Day 20:	Implement an algorithm to find the nth Fibonacci number

"""

#Program

def Fibonacci(n):
	if n <= 0:
		print("Incorrect input")
	elif n == 1:
		return 0
	elif n == 2:
		return 1
	else:
		return Fibonacci(n-1)+Fibonacci(n-2)


n = int(input("Enter the number: "))
print(f"The {n}th Fibonacci number is: ",Fibonacci(n))



"""


Input and Output:

Enter the number: 10
The 10th Fibonacci number is:  34

"""