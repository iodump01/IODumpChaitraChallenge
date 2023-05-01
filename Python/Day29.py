""" 

Day 29:	Write a program that reads in a file and prints out the number of lines, words, and characters in the file.


"""

#Program
number_of_words = 0
number_of_lines = 0
number_of_characters = 0

with open("data.txt", 'r') as file:
    for l in file:
      number_of_words += len(l.split())
      number_of_lines += 1
      number_of_characters = len(l)

print("No of words: ", number_of_words)
print("No of lines: ", number_of_lines)
print("No of characters: ", number_of_characters)





"""

Input and Output: 

Enter file name: IODump.txt
Number of words in text file:  26
Number of lines in text file:  5
Number of characters in text file:  107
Number of spaces in text file:  21

"""