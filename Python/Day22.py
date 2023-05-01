"""

Day 22: Write a program to find the first non-repeating character in a string

"""

#Program

string = input("Enter the string: ")
index = -1
fnc = ""
for i in string:
	if string.count(i) == 1:
		fnc += i
		break
	else:
		index += 1
if index == 1 or fnc == "":
	print("Either all characters are repeating or string is empty")

else: 
    print("First non-repeating character is ", fnc)





"""

Input and Output:

Enter the string: Hello everyone
First non-repeating character is  H

"""