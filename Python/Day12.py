"""

Day 12:	Program to reverse the digits of given number

"""

#Program
n = int(input("Enter the number: "))
m = n
rev = 0

while(n > 0):
	a = n % 10
	rev = rev * 10 + a
	n = n // 10

print(f"The number {m} after reversing:  ", rev)


"""

Input and Output: 
Enter the number: 44567
The number 44567 after reversing:   76544

"""
