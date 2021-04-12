"""
# Let's dive into the interesting topic of regular expressions!
# You are given some input, and you are required to check whether they are valid mobile numbers.

# A valid mobile number is a ten digit number starting with a 7,8,or 9.

# Concept

# A valid mobile number is a ten digit number starting with a 7,8,or 9.

# Regular expressions are a key concept in any programming language.
# A quick explanation with Python examples is available here.
# You could also go through the link below to read more about regular expressions in Python.

# https://developers.google.com/edu/python/regular-expressions

# Input Format

# The first line contains an integer N, the number of inputs.

# N lines follow, each containing some string.

# Constraints
# 1<=N<=10
# 2<=len(phoneNumber)<=15

# Output Format

# For every string listed, print "YES" if it is a valid mobile number and "NO" if it is not on separate lines.
# Do not print the quotes.

# Sample Input

# 2
# 9587456281
# 1252478965

# Sample Output

# YES
# NO

"""

import re


""" 
the r means a raw string
This suppresses the escaping at the interpreter level. The string '\\' gets passed unchanged to the regex parser, 
which again sees one escaped backslash as desired.
It’s good practice to use a raw string to specify a regex in Python whenever it contains backslashes.

re.match() function of re in Python will search the regular expression pattern and return the first occurrence. 
The Python RegEx Match method checks for a match only at the beginning of the string. 
So, if a match is found in the first line, it returns the match object. But if a match is found in some other line, 
the Python RegEx Match function returns null. 

Here is what is happening during with the string 9587456281 and 1252478965

1. \A is the anchor tag. 
    When the regex parser encounters ^ or \A, the parser’s current position must be at the beginning of the search string 
    for it to find a match.
2. \A[7-9] means the string has to start with a 7,8, or 9
3. {m} Matches exactly m repetitions of the preceding regex. [0-9]{9} means the the next 9 characters are between 0 and 9
4. $ or \Z Anchor a match to the end of <string>.
   [0-9]{9}$ means the next 9 digits have to be at the end of the string
   
Thus, 9587456281 gets a YES since it starts with a 9 and the next 0-9 digits are at the end of the string
1252478965 gets a NO since it doesn't start with a 7,8, or 9

"""

number_of_test_cases = int(input("Enter the number of test cases: "))
regex_string = r'\A[7-9][0-9]{9}$'

for number in range(number_of_test_cases):
    print('What is the phone number you want to check: \n')
    number_to_check = re.match(regex_string, input())

    if number_to_check:
        print('YES')
    else:
        print('NO')

