""" 
Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :

Append a character to the end of string  at a cost of  dollar.
Choose any substring of  and append it to the end of  at no charge.
Given  strings , find and print the minimum cost of copying each  to  on a new line.

For example, given a string , it can be copied for  dollars. Start by copying ,  and  individually at a cost of  dollar per character. String  at this time. Copy  to the end of  at no cost to complete the copy.

Function Description

Complete the stringConstruction function in the editor below. It should return the minimum cost of copying a string.

stringConstruction has the following parameter(s):

s: a string
Input Format

The first line contains a single integer , the number of strings.
Each of the next  lines contains a single string, .

Constraints

Subtasks

 for  of the maximum score.
Output Format

For each string  print the minimum cost of constructing a new string  on a new line.

Sample Input

2
abcd
abab
Sample Output

4
2
Explanation

Query 0: We start with  and .

Append character '' to  at a cost of  dollar, .
Append character '' to  at a cost of  dollar, .
Append character '' to  at a cost of  dollar, .
Append character '' to  at a cost of  dollar, .
Because the total cost of all operations is  dollars, we print  on a new line.

Query 1: We start with  and .

Append character '' to  at a cost of  dollar, .
Append character '' to  at a cost of  dollar, .
Append substring  to  at no cost, .
Because the total cost of all operations is  dollars, we print  on a new line.

Note

A substring of a string  is another string  that occurs "in"  (Wikipedia). For example, the substrings of the string "" are "", "" ,"", "", "", and "".
"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'stringConstruction' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def stringConstruction(s):
    # Write your code here
    
    #basically this problem is asking for the amount of unique characters
    working_list = []
    
    #let's iterate through the string and find the unique letters
    for letter in s:
        if letter in working_list:
            #do nothing
            continue
        else:
            working_list.append(letter)
            
    #return the size of working list
    return(len(working_list))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        s = input()

        result = stringConstruction(s)

        fptr.write(str(result) + '\n')

    fptr.close()
