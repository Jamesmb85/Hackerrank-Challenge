# In this challenge, the user enters a string and a substring. You have to print the number of times that the substring occurs in the given string. String traversal will take place from left to right, not from right to left.

# NOTE: String letters are case-sensitive.

# Input Format

# The first line of input contains the original string. The next line contains the substring.

# Constraints
# 1<=len(string)<=200

# Each character in the string is an ascii character.

# Output Format

# Output the integer number indicating the total number of occurrences of the substring in the original string.

# Sample Input

# ABCDCDC
# CDC

# Sample Output

# 2

# Concept

# There are a couple of new concepts:
# In Python, the length of a string is found by the function len(s), where is the string.
# To traverse through the length of a string, use a for loop:

# for i in range(0, len(s)):
    # print (s[i])

# A range function is used to loop over some length:

# range (0, 5)

# Here, the range loops over to . is excluded.

def count_substring(string, sub_string):
    counter=0
    i=0
    while i<len(string):
	#The find() method returns the lowest index of the substring if it is found in given string. 
	#If its is not found then it returns -1.
	#string.find(sub_string,i) is taking the strings and is looking for the substring starting at position i
        if string.find(sub_string,i)>=0:
		#if the string is found it returns the position. We want to change the position of the next search by 1
            i=string.find(sub_string,i)+1
            counter+=1 #increase the counter by 1
        else:
			break

    return counter
	
if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)