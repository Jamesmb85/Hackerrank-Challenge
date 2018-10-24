# You are given a string s and width w.
# Your task is to wrap the string into a paragraph of width w.

# Input Format

# The first line contains a string, s.
# The second line contains the width, w.

# Constraints
# 0<len(s)<1000
# 0<w<len(s)

# Output Format

# Print the text wrapped paragraph.

# Sample Input 0

# ABCDEFGHIJKLIMNOQRSTUVWXYZ
# 4

# Sample Output 0

# ABCD
# EFGH
# IJKL
# IMNO
# QRST
# UVWX
# YZ


#The way i solved this is i didn't use a function, i did it iteratively. Below is an example and here is the result
# What is the string you want to work with? Enter it with no spaces: 
# ABCDEFGHIJKLIMNOQRSTUVWXYZ

# What is the length of the substrings you want to print on each line? 
# 4

# ABCD
# EFGH
# IJKL
# IMNO
# QRST
# UVWX
# YZ

stringInput = input("What is the string you want to work with? Enter it with no spaces: \n")
#strip() in-built function of Python is used to remove all the leading and trailing spaces from a string.
stringInput.strip()
emptyString = ""
text_width = int(input("What is the length of the substrings you want to print on each line? \n")) #need to cast input as an int
for i in stringInput:
    #for each letter in the string, we concatenate it to the empty string
    emptyString+=i
    if(len(emptyString) == text_width):
        print(emptyString)
        #reset length of string after print. Stirng is now empty
        emptyString = ""
#if after the loop the length of emptyString still have characters, print it out
print(emptyString)

