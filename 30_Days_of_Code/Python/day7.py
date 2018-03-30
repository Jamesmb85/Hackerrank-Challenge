# Objective 
# Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!

# Task 
# Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers. 



# Input Format
# The first line contains an integer, N (the size of our array). 
# The second line contains N space-separated integers describing array A's elements.

# Constraints
# 1 <= N <= 1000
# 1 <= Ai <= 10000, where Ai is the ith integer in the array.



# Output Format
# Print the elements of array A in reverse order as a single line of space-separated numbers.



# Sample Input
# 4
# 1 4 3 2

# Sample Output
# 2 3 4 1




#Day7

import sys


n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))

#map() is a function that takes in two arguments: a function and a sequence iterable. 
#In the form: map(function, sequence)
#It returns a new list with the elements changed by function.

i = 0 #counter used for while loop
j = -1 #counter used for string index counting backwards

while i < n:
	print arr[j],
	j += -1 #start at the back of the list and move to the front
	i += 1  #increase counter after printing