"""
re.findall()

The expression re.findall() returns all the non-overlapping matches of patterns in a string as a list of strings.
Code

re.findall(r'\w','http://www.hackerrank.com/')
['h', 't', 't', 'p', 'w', 'w', 'w', 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k', 'c', 'o', 'm']

re.finditer()

The expression re.finditer() returns an iterator yielding MatchObject instances over all non-overlapping matches for the re pattern in the string.
Code

re.finditer(r'\w','http://www.hackerrank.com/')
<callable-iterator object at 0x0266C790>

map(lambda x: x.group(),re.finditer(r'\w','http://www.hackerrank.com/'))
['h', 't', 't', 'p', 'w', 'w', 'w', 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k', 'c', 'o', 'm']

Task
You are given a string S. It consists of alphanumeric characters, spaces and symbols(+,-).
Your task is to find all the substrings of S that 2 contains or more vowels.
Also, these substrings must lie in between

consonants and should contain vowels only.

Note :
Vowels are defined as: AEIOU and aeiou.
Consonants are defined as: QWRTYPSDFGHJKLZXCVBNM and qwrtypsdfghjklzxcvbnm.

Input Format

A single line of input containing string S.

Constraints
0 < len(s) < 100

Output Format

Print the matched substrings in their order of occurrence on separate lines.
If no match is found, print -1.

Sample Input

rabcdeefgyYhFjkIoomnpOeorteeeeet

Sample Output

ee
Ioo
Oeo
eeeee

Explanation

ee is located between consonant d and f.
Ioo is located between consonant k and m.
Oeo is located between consonant p and r.
eeeee is located between consonant t and t.


re.findall(pattern, string, flags=0)

    pattern: regular expression pattern we want to find in the string or text
    string: It is the variable pointing to the target string (In which we want to look for occurrences of the pattern).
    Flags: It refers to optional regex flags. by default, no flags are applied. For example, the re.I flag is used for performing case-insensitive findings.

The regular expression pattern and target string are the mandatory arguments, and flags are optional.


The re.finditer() works exactly the same as the re.findall() method except it returns an iterator yielding match objects
matching the regex pattern in a string instead of a list. It scans the string from left-to-right, and matches are returned
in the iterator form. Later, we can use this iterator object to extract all matches.

But why use finditer()?

In some scenarios, the number of matches is high, and you could risk filling up your memory by loading them all using findall().
Instead of that using the finditer(), you can get all possible matches in the form of an iterator object, which will improve performance.

It means, finditer() returns a callable object which will load results in memory when called.

Here is what is happening during with the string 9587456281 and 1252478965 using the regex below:

regex_pattern = r'(?<=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])([AEIOUaeiou]{2,})(?=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])'

1. [QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm] is a class of all of the upper and lower case consonants.

2.  ?<=<lookbehind_regex> Creates a positive lookbehind assertion.
    - (?<=<lookbehind_regex>) asserts that what precedes the regex parser’s current position must match <lookbehind_regex>.
    In other words, a consonant must come before the next regex string

3. ([AEIOUaeiou]{2,}) is a a group of 2 or more vowels

4. ?=<lookahead_regex> Creates a positive lookahead assertion.
    - (?=<lookahead_regex>) asserts that what follows the regex parser’s current position must match <lookahead_regex>
    -What’s unique about a lookahead is that the portion of the search string that matches <lookahead_regex> isn’t consumed, and it isn’t part of the returned match object.


So, overall, a consonant must precede at least 2 vowels and those 2 vowels are succeeded by a consonant.



"""

import re

regex_pattern = r'(?<=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])([AEIOUaeiou]{2,})(?=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])'

result = re.finditer(regex_pattern, input())

#only used to take care of test cases where finditer returns an empty iterator.
#Match objects always have a boolean value of True. So, we print -1 since the for loop will always execute
count = 0

for match_object in result:
    print(match_object.group())
    count += 1

if not count:
    print(-1)
