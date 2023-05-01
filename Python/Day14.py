"""

Day 14:	Taking a and b as user input, print the value of a^b (a raised to b).(Use for loop)


"""

#Program
def power(a, b):
    
    result = 1
    for i in range (0, b):
        result = result * a
    
    print(f"The value of {a} raised to {b} is: ", result)


a = float(input("Enter the number: "))
b = int(input("Enter the power: "))

power(a, b)



"""

Input and Output: 
Enter the number: 2
Enter the power: 4
The value of 2.0 raised to 4 is:  16.0

"""