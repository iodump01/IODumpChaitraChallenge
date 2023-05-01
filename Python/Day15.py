"""

Day 15:	Program to check whether the given number is palindrome or not.


"""

#Program
def palindrome(m):
    rev = 0
    n = m
    
    while n > 0:
        rev = (rev * 10) + (n % 10)
        n = n // 10
    
    if (m == rev):
        print(f"{m} is a PALINDROME.")
    else:
        print(f"{m} is NOT PALINDROME")
        

n = int(input("Enter the number: "))
palindrome(n)





"""

Input and Output: 

Enter the number: 4334
4334 is a PALINDROME.

"""