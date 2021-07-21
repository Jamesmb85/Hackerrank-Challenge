"""
Given two strings, determine if they share a common substring. A substring may be as small as one character.

Example


These share the common substring .



These do not share a substring.

Function Description

Complete the function twoStrings in the editor below.

twoStrings has the following parameter(s):

string s1: a string
string s2: another string
Returns

string: either YES or NO
Input Format

The first line contains a single integer , the number of test cases.

The following  pairs of lines are as follows:

The first line contains string .
The second line contains string .
Constraints

 and  consist of characters in the range ascii[a-z].
Output Format

For each pair of strings, return YES or NO.

Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

We have  pairs to check:

, . The substrings  and  are common to both strings.
, .  and  share no common substrings.

"""
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'twoStrings' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s1
#  2. STRING s2
#

def twoStrings(s1, s2):
    # Write your code here
      
    #let's check to see if any of s1 characters is in s2
    for letter in s1:
        if letter in s2:
            return "YES"
    
	#let's check to see if any of s2 characters is in s1
    for letter in s2:
        if letter in s1:
            return "YES"
            
    #we did the check both ways since the strings may not be of the same length. We return NO at this point
    return "NO"

    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        s1 = input()

        s2 = input()

        result = twoStrings(s1, s2)

        fptr.write(result + '\n')

    fptr.close()
