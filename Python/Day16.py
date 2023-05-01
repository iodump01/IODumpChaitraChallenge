""" 

Day 16:	Program to find the kth largest element of the list

"""


#Program
n = int(input("How many elements you want to insert? "))
arr = []

for i in range(1 ,n+1):
    j = int(input("Enter the number: "))
    arr.append(j)
    
# sorting in descending order
for i in range(0, len(arr)):    
    for j in range(i+1, len(arr)):    
        if(arr[i] < arr[j]):    
            temp = arr[i]   
            arr[i] = arr[j]   
            arr[j] = temp
    


k = int(input("Enter the kth largest number: "))
print ("kth largest element:", arr[k-1])



""" 


Input and Output: 

How many elements you want to insert? 5
Enter the number: 12
Enter the number: 3
Enter the number: 45
Enter the number: 67
Enter the number: 88
Enter the kth largest number: 3
kth largest element: 45


"""