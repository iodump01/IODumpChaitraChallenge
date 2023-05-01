"""

Day 25:	Print the following pattern:
            * * * * *
             * * *
               *

"""

#Program
rows = 3
for i in range(rows, -1, -1):
    for space in range(0, rows-i):
        print("  ", end="")
    for j in range(i, 2*i):
        print("* ", end="")
    for j in range(0, i-1):
        print("* ", end="")
    print()
    
    


""" 

Output:

* * * * * 
  * * * 
    * 
    
"""
