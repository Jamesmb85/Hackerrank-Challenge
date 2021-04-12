"""   
You are given the lengths AB and BC.
Your task is to find  (angle , as shown in the figure) in degrees.

Input Format

The first line contains the length of side .
The second line contains the length of side .

Constraints


Lengths  and  are natural numbers.
Output Format

Output  in degrees.

Note: Round the angle to the nearest integer.

Examples:
If angle is 56.5000001°, then output 57°.
If angle is 56.5000000°, then output 57°.
If angle is 56.4999999°, then output 56°.


Sample Input

10
10
Sample Output

45°

"""


#Import math Library
from math import atan, degrees

#unicode for degree sign
degree_sign = u"\N{DEGREE SIGN}"

#input the opposite side length and cast as an int
opposite_side = int(input())
#input the adjacent  side length and cast as an int
adjacent_side = int(input())

"""   
atan(opposite_side/adjacent_side) returns the angle in radians
degrees(atan(opposite_side/adjacent_side)) converts angle in degrees
round(degrees(atan(opposite_side/adjacent_side))) removes the numbers after the decimal since the default is 0 decimal places
We cast to a string using str since we need to concatenate with the unicode degree symbol
"""
print(str(round(degrees(atan(opposite_side/adjacent_side)))) + degree_sign)