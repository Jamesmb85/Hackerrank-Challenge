You are given a string S consisting only of digits 0-9, commas, "," and dots "."

Your task is to complete the regex_pattern defined below, which will be used to re.split() all of the , and . symbols in S.

It's guaranteed that every comma and every dot in S is preceeded and followed by a digit.

Sample Input 0

100,000,000.000

Sample Output 0

100
000
000
000

regex_pattern = r"[,.]"	# Do not delete 'r'.
print("\n".join(re.split(regex_pattern, input())))

# []  Represent a character class and regex_pattern is split by either the comma or dot

# re.split(pattern, string, maxsplit=0, flags=0)
# Split string by the occurrences of pattern. If capturing parentheses are used in pattern, 
# then the text of all groups in the pattern are also returned as part of the resulting list. 
# If maxsplit is nonzero, at most maxsplit splits occur, and the remainder of the string is 
# returned as the final element of the list.