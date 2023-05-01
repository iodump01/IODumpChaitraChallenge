"""

Day 19:	Take a character (uppercase, lowercase, numbers, special characters) and print whether the character is an uppercase alphabet, lowercase alphabet, number or a special character

"""


#Program
def check(ch):
  
    if 'A' <= ch <= 'Z':
        print(ch,"is an UpperCase alphabet character")
  
    elif 'a' <= ch <= 'z':
        print(ch," is an LowerCase alphabet character")
        
    elif '0' <= ch <= '9':
        print(ch," is a number")
        
    else:
        print(ch, " is a Special character")
        

n = input("Enter the string: ")
check(n)



""" 

Input and Output: 

Enter the string: 0
0  is a number

"""
