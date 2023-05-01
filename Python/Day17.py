"""

Day 17:	Program to find whether s is a substring of str or not using recursion.

"""

#Program
def isSubstring(s2, s1):
	if s2 in s1:
		return s1.index(s2)
	return -1



s1 = input("Enter the string: ")
s2 = input("Enter the substring: ")

result = isSubstring(s2, s1)
if result == -1:
	print(f"\"{s2}\" is NOT a SUBSTRING of \"{s1}\" ")
else:
	print(f"\"{s2}\" is a SUBSTRING of \"{s1}\" ")



"""

Input and Output: 

Enter the string: Welcome to IODump Chaitra Challenge
Enter the substring: Challenge
"Challenge" is a SUBSTRING of "Welcome to IODump Chaitra Challenge"

"""