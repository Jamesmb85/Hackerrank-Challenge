# Given an integer, n, print the following values for each integer i from 1 to n:

    # Decimal
    # Octal
    # Hexadecimal (capitalized)
    # Binary

# The four values must be printed on a single line in the order specified above for each i from to n. 
# Each value should be space-padded to match the width of the binary value of n.

# Input Format

# A single integer denoting n.

# Constraints
# 1<=n<=99

# Output Format

# Print n lines where each line (in the range 1<=i<=n) contains the respective decimal, octal, capitalized hexadecimal, 
# and binary values of i. Each printed value must be formatted to the width of the binary value of n.

# Sample Input

# 17

# Sample Output

    # 1     1     1     1
    # 2     2     2    10
    # 3     3     3    11
    # 4     4     4   100
    # 5     5     5   101
    # 6     6     6   110
    # 7     7     7   111
    # 8    10     8  1000
    # 9    11     9  1001
   # 10    12     A  1010
   # 11    13     B  1011
   # 12    14     C  1100
   # 13    15     D  1101
   # 14    16     E  1110
   # 15    17     F  1111
   # 16    20    10 10000
   # 17    21    11 10001
   
#The way i solved this is i didn't use a function, i did it iteratively. Below is an example and here is the result
# What is the maximum value you want to print to? 
# 25
# 1 1 1 1
# 2 2 2 10
# 3 3 3 11
# 4 4 4 100
# 5 5 5 101
# 6 6 6 110
# 7 7 7 111
# 8 10 8 1000
# 9 11 9 1001
# 10 12 A 1010
# 11 13 B 1011
# 12 14 C 1100
# 13 15 D 1101
# 14 16 E 1110
# 15 17 F 1111
# 16 20 10 10000
# 17 21 11 10001
# 18 22 12 10010
# 19 23 13 10011
# 20 24 14 10100
# 21 25 15 10101
# 22 26 16 10110
# 23 27 17 10111
# 24 30 18 11000
# 25 31 19 11001


value = int(input("What is the maximum value you want to print to? \n"))
for number in range(1,value+1):
    print("{0:d} {0:o} {0:X} {0:b}".format(number,number,number,number))   
