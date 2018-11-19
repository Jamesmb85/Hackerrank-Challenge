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
m = re.search(r'([a-zA-Z0-9])\1', input())
# re.search(pattern, string, flags=0)

# Scan through string looking for the first location where the regular expression pattern produces a match, 
# and return a corresponding MatchObject instance. Return None if no position in the string matches the pattern


# r'([a-zA-Z0-9])\1' 
# The first parenthesis makes it a group. The first group matches any character in A-Z, or a-z or 0-9. 
# Group numbering always begins from 1. The second parenthesis makes it a second group. 
# But the second group back references the first group using \1. 
# Each item that you surround with parenthesis in the regular expression will correspond to a number \1, \2, etc.

# The above cited regular expression will match any repeating character. 
# So basically, the above expression means that when the first group finds a match, then, 
# the following character(consecutive) should be equal to the first character. Or a generalized way of saying this is, 
# that when the first group matches with any part of the string, then the following portion of the string should 
# match back referenced first group.
if m:
    print(m.group(1))
else:
    print("-1")
	
