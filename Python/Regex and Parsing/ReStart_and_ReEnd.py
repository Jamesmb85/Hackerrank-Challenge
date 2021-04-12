"""
start() & end()

These expressions return the indices of the start and end of the substring matched by the group.

Code

import re
m = re.search(r'\d+','1234')
 m.end()
4
 m.start()
0

Task
You are given a string S.
Your task is to find the indices of the start and end of string k in S.

Input Format

The first line contains the string S.
The second line contains the string k.

Constraints
0 <= len(S) < 100
0 << len(k) < len(s)


Output Format

Print the tuple in this format: (start _index, end _index).
If no match is found, print (-1, -1).

Sample Input

aaadaa
aa

Sample Output

(0, 1)
(1, 2)
(4, 5)


"""

import re

working_string = input()
sub_string = input()

#we need to find if the substring exists. The problem says a string, but doesn't specify if any special characters exist
regex_patten = r'(\w){1,100}?'

for _ in working_string:
    regex_string = re.match(regex_patten, sub_string)

    if(regex_patten):
        print((regex_string.start(), regex_string.end()))
    else:
        print((-1.-1))


