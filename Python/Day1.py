"""
Day 1: Program to find the largest and smallest of the given 5 numbers
"""

# Program
a = int(input("Enter First Number: "))
b = int(input("Enter Second Number: "))
c = int(input("Enter Third Number: "))
d = int(input("Enter Fourth Number: "))
e = int(input("Enter Fifth Number: "))


if a > b and a > c and a > d and a > e:
    print('The largest number: ', a)
elif b > a and b > c and b > d and b > e:
    print('The largest number: ', b)
elif c > a and c > b and c > d and c > e:
    print('The largest number: ', c)
elif d > a and d > b and d > c and d > e:
    print('The largest number: ', d)
elif e > a and e > b and e > c and e > d:
    print('The largest number: ', e)
else:
    print("INVALID")


if a < b and a < c and a < d and a < e:
    print('The smallest number: ', a)
elif b < a and b < c and b < d and b < e:
    print('The smallest number: ', b)
elif c < a and c < b and c < d and c < e:
    print('The smallest number: ', c)
elif d < a and d < b and d < c and d < e:
    print('The smallest number: ', d)
elif e < a and e < b and e < c and e < d:
    print('The smallest number: ', e)
else:
    print("INVALID")


"""

Input:
Enter First Number: 1
Enter Second Number: 2
Enter Third Number: 3
Enter Fourth Number: 4
Enter Fifth Number: 5

Output:
The largest number is:  5
The smallest number:  1

"""
