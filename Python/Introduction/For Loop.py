# Task
# Read an integer N. For all non-negative integers i < N , print i**2. See the sample for details.

# Input Format

# The first and only line contains the integer, N.

# Constraints
# 1 <= N <= 20

# Output Format

# Print N lines, one corresponding to each i. 

####################################################################################################################
##############################################Solution##############################################################
##############################################Solution##############################################################
##############################################Solution##############################################################

N = int(raw_input()) #takes input and assigns it to variable N

for value in range (0, N): #using a for loop since we know the range. Goes from 0 to N-1
	print value ** 2

#Output is the following:
# 0
# 1
# 4
# 9
# 16
# and so on
# 
#  
	