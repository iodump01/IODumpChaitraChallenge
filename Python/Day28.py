"""
    
Day 28:	Implement a function that takes a list of strings as input and returns a new list that contains all the strings with the first letter capitalized.

"""


#Program
def wordCasing(word):
    return word.capitalize() if len(word)>3 else word.lower()

title = []
n = int(input("Enter the number of elements: "))

for i in range (1, n+1):
    title.append(input("Enter the string: "))
    
result = list(map(wordCasing, title))
result[0] =result[0].capitalize()
print (result)


""" 

Input and Output: 

Enter the number of elements: 3
Enter the string: hello
Enter the string: Welcome
Enter the string: EVERYONE
['Hello', 'Welcome', 'Everyone']

"""