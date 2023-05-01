"""

Day 27: Write a program that takes two matrices as input and returns the product of the matrices


"""

#Program

A = [[12, 7, 3],
	[4, 5, 6],
	[7, 8, 9]]

B = [[5, 8, 1, 2],
	[6, 7, 3, 0],
	[4, 5, 9, 1]]
	
result = [[0, 0, 0, 0],
		[0, 0, 0, 0],
		[0, 0, 0, 0]]

for i in range(len(A)):

	for j in range(len(B[0])):

		for k in range(len(B)):
			result[i][j] += A[i][k] * B[k][j]
print("Multiplication of 2 matrices: ")
for r in result:
	print(r)





""" 


Input and Output: 

Multiplication of 2 matrices: 
[114, 160, 60, 27]
[74, 97, 73, 14]
[119, 157, 112, 23]


"""