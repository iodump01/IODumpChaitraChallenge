""" 

Day 30:	Implement Binary Search Algorithm.

"""

#Program
def binary_search(list1, n):  
    low = 0  
    high = len(list1) - 1  
    mid = 0  
  
    while low <= high:  
        mid = (high + low) // 2  
  
        if list1[mid] < n:  
            low = mid + 1  
  
        elif list1[mid] > n:  
            high = mid - 1  
  
        else:  
            return mid  
  
    return -1  
  
  
m = int(input("Enter the number of elements to add in the list: ")) 
list1 = []
print("Enter the elements in ascending order \n")
for i in range (1, m+1):
    list1.append(int(input("Enter the number: ")))  


n = int(input("\nEnter the element to search: "))

print("\n")
result = binary_search(list1, n)  
  
if result != -1:  
    print("Element is present at index", str(result))  
else:  
    print("Element is not present in list1")  
    
    
    
    
""" 

Input and Output:

Enter the number: 12
Enter the number: 34
Enter the number: 56
Enter the number: 78
Enter the number: 888

Enter the element to search: 78


Element is present at index 3

"""