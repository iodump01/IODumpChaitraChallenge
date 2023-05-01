"""

Day 26: Implement a function that takes a string as input and returns the minimum number of insertions required to make the string a palindrome. 

"""

#Program
def min_Insertions_To_Make_Palindrome(str):
    n = len(str)
    dp = [[0 for i in range(n)] for j in range(n)]
    for gap in range(1, n):
        for l in range(n-gap):
            r = l + gap
            if str[l] == str[r]:
                dp[l][r] = dp[l+1][r-1]
            else:
                dp[l][r] = min(dp[l+1][r], dp[l][r-1]) + 1
    return dp[0][n-1]

str = input("Enter the string: ")
print("Minimum number of insertions required to make the string a palindrome:", min_Insertions_To_Make_Palindrome(str))


 
 
""" 

Input and Output: 

Enter the string: abcdefgg
Minimum number of insertions required to make the string a palindrome: 6

"""