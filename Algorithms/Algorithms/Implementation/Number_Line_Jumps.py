"""
ou are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

    The first kangaroo starts at location

and moves at a rate of
meters per jump.
The second kangaroo starts at location
and moves at a rate of

    meters per jump.

You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

Example



After one jump, they are both at , (,

), so the answer is YES.

Function Description

Complete the function kangaroo in the editor below.

kangaroo has the following parameter(s):

    int x1, int v1: starting position and jump distance for kangaroo 1
    int x2, int v2: starting position and jump distance for kangaroo 2

Returns

    string: either YES or NO

Input Format

A single line of four space-separated integers denoting the respective values of
, , , and

.

Constraints

Sample Input 0

0 3 4 2

Sample Output 0

YES

Explanation 0

The two kangaroos jump through the following sequence of locations:

"""


#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'kangaroo' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER x1
#  2. INTEGER v1
#  3. INTEGER x2
#  4. INTEGER v2
#

def kangaroo(x1, v1, x2, v2):
    # Write your code here

    #we need to loop until we find if x1 + v1 == x2 + v2
    #if we get a match we break the loop and print yes
    #if we get to the end of the loop and no match, print no

    jumps = 0
    kangaroo1_jumping_distance = x1 + v1
    kangaroo2_jumping_distance = x2 + v2

    while jumps <= 10000:
        #check to see if kangaroo1_jumping_distance == kangaroo2_jumping_distance
        if kangaroo1_jumping_distance == kangaroo2_jumping_distance:
            return 'YES'
        #we need to increase our variables by v1 and v2 respectively
        else:
            #increase our variables
            kangaroo1_jumping_distance += v1
            kangaroo2_jumping_distance += v2

            #increase jumps by 1
            jumps += 1

    #after 10000 jumps they are never at the same location so we return no
    return 'NO'


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    x1 = int(first_multiple_input[0])

    v1 = int(first_multiple_input[1])

    x2 = int(first_multiple_input[2])

    v2 = int(first_multiple_input[3])

    result = kangaroo(x1, v1, x2, v2)

    fptr.write(result + '\n')

    fptr.close()
