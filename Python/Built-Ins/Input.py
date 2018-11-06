# input()

# In Python 2, the expression input() is equivalent to eval(raw _input(prompt)).

# Code

# >>> input()  
# 1+2
# 3
# >>> company = 'HackerRank'
# >>> website = 'www.hackerrank.com'
# >>> input()
# 'The company name: '+company+' and website: '+website
# 'The company name: HackerRank and website: www.hackerrank.com'

# Task

# You are given a polynomial P, of a single indeterminate (or variable), x.
# You are also given the values of x and k. Your task is to verify if P(x) = k.

# Constraints
# All coefficients of polynomial P are integers.
# x and y are also integers.

# Input Format

# The first line contains the space separated values of x and k.
# The second line contains the polynomial P.

# Output Format

# Print True if P(x) = k. Otherwise, print False.

# Sample Input

# 1 4
# x**3 + x**2 + x + 1

# Sample Output

# True

# Explanation

# P(1) = (1**3) + (1**2) + (1**1) + (1**0) = 4 = k

# Hence, the output is True.

#unpack values into variables
x,k = map(int, input().split())
#eval is also used in applications needing to evaluate math expressions. This is much easier than writing an expression parser.
#So, eval is evaluating the polynommial entered in input() and return ture or false is it equals k
print(k == eval(input()) )