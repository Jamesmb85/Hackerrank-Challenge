"""
A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of the SOS message have been changed by radiation.

Example


The original message was SOSSOS. Two of the message's characters were changed in transit.

Function Description

Complete the marsExploration function in the editor below.

marsExploration has the following parameter(s):

string s: the string as received on Earth
Returns

int: the number of letters changed during transmission
Input Format

There is one line of input: a single string, .

Constraints

 will contain only uppercase English letters, ascii[A-Z].
Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Explanation 0

 = SOSSPSSQSSOR, and signal length . They sent  SOS messages (i.e.: ).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR
Difference:          X  X   X
Sample Input 1

SOSSOT
Sample Output 1

1
Explanation 1

 = SOSSOT, and signal length . They sent  SOS messages (i.e.: ).

Expected Signal: SOSSOS     
Received Signal: SOSSOT
Difference:           X
Sample Input 2

SOSSOSSOS
Sample Output 2

0
Explanation 2

Since no character is altered, return 0.

"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'marsExploration' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def marsExploration(s):
    # Write your code here
    
    number_of_changed_letters = 0
    
    working_string = ''
    
    #we need to loop through the and concatenate the letters. Once the size of the string is 3, we compare
    
    for letter in s:
        #concatenate the string
        working_string += letter
        
        #check size of string and compare
        if(len(working_string) == 3):
            #need to compare each character
            if(working_string[0] != 'S'):
                #if character isn't the same, we increase our variables
                number_of_changed_letters += 1
            if(working_string[1] != 'O'):
                #if character isn't the same, we increase our variables
                number_of_changed_letters += 1
            if(working_string[2] != 'S'):
                #if character isn't the same, we increase our variables
                number_of_changed_letters += 1    
                
            #after the checks above, we reset the working_string
            working_string = '' 
        
            
    return number_of_changed_letters

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()
