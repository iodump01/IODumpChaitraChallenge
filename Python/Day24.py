"""

Day 24: Write a program that takes a list of integers as input and returns a new list that contains only the elements that appear more than once in the original list.

"""

#Program
def printRepeating(arr, n):

	mp = [0] * 100
	for i in range(0, n):
		mp[arr[i]] += 1

	for i in range(0, n):
		if (mp[arr[i]] > 1):
			print(arr[i], end = " ")
			
			mp[arr[i]] = 0
	
arr = []
n = int(input('Enter the number of elements you want to enter: '))

for i in range (1, n+1):
    arr.append(int(input("Enter the element: ")))
    
    
print("The repeating integers are: ")
printRepeating(arr, n)






"""


Input and Output: 

Enter the number of elements you want to enter: 8
Enter the element: 12
Enter the element: 34
Enter the element: 56
Enter the element: 12
Enter the element: 56
Enter the element: 88
Enter the element: 0
Enter the element: 000
The repeating integers are:
12 56 0


"""