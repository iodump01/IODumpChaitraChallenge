"""

Day5: Program to print sum of n even numbers

"""

num = int(input("Print sum of even numbers till: "))
total = 0
for i in range(1, num + 1):

    if((i % 2) == 0):
        total = total + i

print("\nSum of even numbers from 1 to", num, "is", total)


"""

Input and Output:
Print sum of even numbers till: 6

Sum of even numbers from 1 to 6 is 12


"""
