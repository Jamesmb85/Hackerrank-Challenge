# group()

# A group() expression returns one or more subgroups of the match.
# Code

# >>> import re
# >>> m = re.match(r'(\w+)@(\w+)\.(\w+)','username@hackerrank.com')
# >>> m.group(0)       # The entire match
# 'username@hackerrank.com'
# >>> m.group(1)       # The first parenthesized subgroup.
# 'username'
# >>> m.group(2)       # The second parenthesized subgroup.
# 'hackerrank'
# >>> m.group(3)       # The third parenthesized subgroup.
# 'com'
# >>> m.group(1,2,3)   # Multiple arguments give us a tuple.
# ('username', 'hackerrank', 'com')

# groups()

# A groups() expression returns a tuple containing all the subgroups of the match.
# Code

# >>> import re
# >>> m = re.match(r'(\w+)@(\w+)\.(\w+)','username@hackerrank.com')
# >>> m.groups()
# ('username', 'hackerrank', 'com')

# groupdict()

# A groupdict() expression returns a dictionary containing all the named subgroups of the match, keyed by the subgroup name.
# Code

# >>> m = re.match(r'(?P<user>\w+)@(?P<website>\w+)\.(?P<extension>\w+)','myname@hackerrank.com')
# >>> m.groupdict()
# {'website': 'hackerrank', 'user': 'myname', 'extension': 'com'}

# Task

# You are given a string S.
# Your task is to find the first occurrence of an alphanumeric character in S(read from left to right) that has consecutive repetitions.

# Input Format

# A single line of input containing the string S.

# Constraints
# 0<len(s)<100

# Output Format

# Print the first occurrence of the repeating character. If there are no repeating characters, print -1.

# Sample Input

# ..12345678910111213141516171820212223

# Sample Output

# 1

# Explanation

# .. is the first repeating character, but it is not alphanumeric.
# 1 is the first (from left to right) alphanumeric repeating character of the string in the substring 111.

import re

"""
the r means a raw string
This suppresses the escaping at the interpreter level. The string '\\' gets passed unchanged to the regex parser, 
which again sees one escaped backslash as desired.
It’s good practice to use a raw string to specify a regex in Python whenever it contains backslashes.

Here is what is happening during with the string ..12345678910111213141516171820212223

1. We take the string into the variable working_string
2. The re.search method searches the string for a match, and returns a Match object if there is a match.
   If there is more than one match, only the first occurrence of the match will be returned:
3.  (\w)\1+ is broken down as the following
    A. \w is looking for 1 alphanumeric character. This is the same as using the character class [a-zA-Z0-9_].
       In this case 1 is the first alphanumeric character
    
    B. (\w) is a capture group of the alphanumeric character 1. 
    
    C. (\w)\1 means  \1 is a backreference to the first captured group and matches 1 again.
    
4. So, re.search searches for 11 in the working string

5. The 11 is in the first capture group so print it out

6. If the regex string isn't found, re.search returns None

"""

working_string = input()

regrex_string = re.search(r'(\w)\1', working_string)

if(regrex_string):
    print(regrex_string.group(1))
else:
    print(-1)


