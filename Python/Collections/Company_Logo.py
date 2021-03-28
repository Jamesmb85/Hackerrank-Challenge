"""
A newly opened multinational brand has decided to base their company logo on the three most common characters in the company name. 
They are now trying out various combinations of company names and logos based on this condition. Given a string S, 
which is the company name in lowercase letters, your task is to find the top three most common characters in the string.

Print the three most common characters along with their occurrence count.
Sort in descending order of occurrence count.
If the occurrence count is the same, sort the characters in alphabetical order.

For example, according to the conditions described above, GOOGLE would have it's logo with the letters G,O,E.

Input Format

A single line of input containing the string S.

Constraints
3 < len(s) < 10**4

S has at least 3 distinct characters

Output Format

Print the three most common characters along with their occurrence count each on a separate line.
Sort output in descending order of occurrence count.
If the occurrence count is the same, sort the characters in alphabetical order.

Sample Input 0

aabbbccde

Sample Output 0

b 3
a 2
c 2

Explanation 0

Here, b occurs times. It is printed first.
Both a and c occur

times. So, a is printed in the second line and c in the third line because a comes before c in the alphabet.

Note: The string
has at least distinct characters. 

"""

#import Collections module
from collections import Counter

print('Enter the string we are analyzing: ')
working_string = input()

"""this line does the following:
1. Sorts the string
2. The Counter module takes all of the letters as keys and their counts as the values
3. The result assigned to c
"""
c = Counter(sorted(working_string))

#We print out the Key-Value pairs by using unpacking using the * operator
# most_common(3) return a list of the 3 most common elements and their counts from the most common to the least
for i in c.most_common(3):
    print(*i)
