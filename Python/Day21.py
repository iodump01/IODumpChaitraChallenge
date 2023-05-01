"""

Day 21: Implement a function to check if a given string contains a valid email address

"""


#Program
def isChar(c):
    return ((c >= 'a' and c <= 'z'))

def isDigit(c):
    return (c >= '0' and c <= '9')

def is_valid(email):
    if not isChar(email[0]):
        return 0
    At = -1
    Dot = -1
    for i in range(len(email)):
        if email[i] == '@':
            At = i
        elif email[i] == '.':
            Dot = i
    if At == -1 or Dot == -1:
        return 0
    if At > Dot:
        return 0
    return not (Dot >= (len(email) - 1))

email = input("Enter the email address: ")
ans = is_valid(email)

if ans:
    print(email, ": valid")
else:
    print(email, ": invalid")





""" 

Input and Output: 

Enter the email address: IODump@iod.com
IODump@iod.com : invalid


"""