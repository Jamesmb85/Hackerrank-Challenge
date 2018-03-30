# Objective
# In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to learn more.

# Task
# Given an integer, n, print its first 10 multiples. Each multiple n * i (where 1 <=i<=n) should be printed on a new line in the form: n x i = result.

# Input Format

# A single integer, n.

# Constraints
# 2<=n<=20

# Output Format

# Print lines of output; each line (where 1<=i<=10) contains the of in the form:
# n x i = result.

# Sample Input
# 2

# Sample Output
# 2 x 1 = 2
# 2 x 2 = 4
# 2 x 3 = 6
# 2 x 4 = 8
# 2 x 5 = 10
# 2 x 6 = 12
# 2 x 7 = 14
# 2 x 8 = 16
# 2 x 9 = 18
# 2 x 10 = 20

####################################################################################################################
##############################################Solution##############################################################
##############################################Solution##############################################################
##############################################Solution##############################################################

#!/bin/python
import sys

n = int(raw_input().strip())

for value in range (1, 11):
	number = n * value 
	number = str(number)#need to convert to a string so we can concatenate 
	value = str(value) #need to convert to a string so we can concatenate
	n = str(n) #need to convert to a string so we can concatenate
	print n + ' x ' + value + ' = ' + number #this gives the sample output
	n = int(n) #need to convert to an int so we can calculate the number as an integer again

