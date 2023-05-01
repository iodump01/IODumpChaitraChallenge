"""

Day 18:	Program to sort the elements in the list/ array in ascending order.


"""

#Program
     
arr = []
temp = 0

n = int(input("How many elements you want to add? "))     
for i in range(1, n+1):
    k = int(input("Enter the element: "))
    arr.append(k)

print("\n\nElements of original array: ");    
for i in range(0, len(arr)):    
    print(arr[i], end=" ");    
       
for i in range(0, len(arr)):    
    for j in range(i+1, len(arr)):    
        if(arr[i] > arr[j]):    
            temp = arr[i]   
            arr[i] = arr[j]  
            arr[j] = temp   
     
print("\n\nElements of array sorted in ascending order: ");    
for i in range(0, len(arr)):    
    print(arr[i], end=" ")
    
    
    
    
    
    
    
"""
    
    
Input and Output: 
    
How many elements you want to add? 6
Enter the element: 12
Enter the element: 33
Enter the element: 09
Enter the element: 70
Enter the element: 00
Enter the element: 678


Elements of original array:
12 33 9 70 0 678

Elements of array sorted in ascending order:
0 9 12 33 70 678
"""