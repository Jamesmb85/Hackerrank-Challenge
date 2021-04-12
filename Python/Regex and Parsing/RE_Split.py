"""You are given a string S consisting only of digits 0-9, commas, "," and dots "."

Your task is to complete the regex_pattern defined below, which will be used to re.split() all of the , and . symbols in S.

It's guaranteed that every comma and every dot in S is preceeded and followed by a digit.

Sample Input 0

100,000,000.000

Sample Output 0

100
000
000
000

"""

import re

"""
the r means a raw string
This suppresses the escaping at the interpreter level. The string '\\' gets passed unchanged to the regex parser, 
which again sees one escaped backslash as desired.
It’s good practice to use a raw string to specify a regex in Python whenever it contains backslashes.

The split() function returns a list where the string has been split at each match:

Here is what is happening during with the string 100,000,000.000

1. [,.] is a character class that means there is a match when a comma(,) or period(.) is found
2. r"[,.]" means the string is a raw string
3. The re.split method takes two parameters and returns a list passed on the regrex value
4. So, the list that  is returned is ['100', '000', '000', '000'] because it splits on either a comma or period
5. THe join function concatenate the string on a newline

"""

regex_pattern = r"[,.]"
print("\n".join(re.split(regex_pattern, input())))