"""
We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.

More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

Example

This contains a subsequence of all of the characters in the proper order. Answer YES


This is missing the second 'r'. Answer NO.


There is no 'c' after the first occurrence of an 'a', so answer NO.

Function Description

Complete the hackerrankInString function in the editor below.

hackerrankInString has the following parameter(s):

string s: a string
Returns

string: YES or NO
Input Format

The first line contains an integer , the number of queries.
Each of the next  lines contains a single query string .

Constraints

Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO
Explanation 0

We perform the following  queries:


The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we return YES.
 does not contain the last three characters of hackerrank, so we return NO.
Sample Input 1

2
hhaacckkekraraannk
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
Sample Output 1

YES
NO

"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'hackerrankInString' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def hackerrankInString(s):
    # Write your code here
    
    #let remove the whitespace and make all of the characters lowercase
    working_string = s.lower().strip()
    
    #string used for comparison at the end
    empty_string = ''
    
    #we need to traverse the string and compare concatenate if conditions are met
    for letter in working_string:
        if letter == 'h' and empty_string == '':
            empty_string += letter
        if letter == 'a' and empty_string == 'h':
            empty_string += letter
        if letter == 'c' and empty_string == 'ha':
            empty_string += letter
        if letter == 'k' and empty_string == 'hac':
            empty_string += letter
        if letter == 'e' and empty_string == 'hack':
            empty_string += letter
        if letter == 'r' and empty_string == 'hacke':
            empty_string += letter
        if letter == 'r' and empty_string == 'hacker':
            empty_string += letter    
        if letter == 'a' and empty_string == 'hackerr':
            empty_string += letter
        if letter == 'n' and empty_string == 'hackerra':
            empty_string += letter
        if letter == 'k' and empty_string == 'hackerran':
            empty_string += letter

            
    #after the loop if all of the letter are there then the strings should match
    if empty_string == 'hackerrank':
        return 'YES'
    else:
        return 'NO'

        
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        s = input()

        result = hackerrankInString(s)

        fptr.write(result + '\n')

    fptr.close()
