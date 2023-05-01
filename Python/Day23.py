"""

Day 23: Implement a function that takes two integers as input and returns their greatest common divisor (GCD)


"""

#Program

def hcf(a, b):
	if(b == 0):
		return a
	else:
		return hcf(b, a % b)

a = int(input("Enter the number:  "))
b = int(input("Enter the number: "))


print(f"The gcd of {a} and {b} is : ", end="")
print(hcf(a, b))




"""

Input and Output:

Enter the number:  60
Enter the number: 48
The gcd of 60 and 48 is : 12


"""