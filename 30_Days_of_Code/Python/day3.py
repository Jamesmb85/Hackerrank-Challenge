# Objective 
 # In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

# Task 
 # Given an integer, N, perform the following conditional actions:
# •If N is odd, print Weird
# •If N is even and in the inclusive range of  to , print Not Weird
# •If N is even and in the inclusive range of  to , print Weird
# •If N is even and greater than , print Not Weird

# Complete the stub code provided in your editor to print whether or not n is weird.



# Input Format
# A single line containing a positive integer, n.



# Constraints 1<=n<=100


# Output Format
# Print Weird if the number is weird; otherwise, print Not Weird.

####################################################################################################################
##############################################Solution##############################################################
##############################################Solution##############################################################
##############################################Solution##############################################################

#!/bin/python

import sys #import sys module

N = int(raw_input().strip()) #input is read from stdin 

if (N % 2 == 0) and (N >= 2 and N <= 5):
    print 'Not Weird'
elif (N % 2 == 0) and (N >= 6 and N <= 20):
    print 'Weird'
elif (N % 2 == 0) and N > 20:
    print 'Not Weird'
elif N < 2 and N >= 1:
    print 'Not Weird'
else:
    print 'Weird'