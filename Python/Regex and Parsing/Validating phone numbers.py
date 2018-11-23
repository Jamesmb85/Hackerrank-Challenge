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


number_of_test_cases = int(input("Enter the number of test cases: "))
for values in range(number_of_test_cases):
    phoneNumber = input()
    match = re.match(r"[7-9]\d{9}$", phoneNumber)
	re.match() : This function attempts to match pattern to whole string. 
	# The re.match function returns a match object on success, None on failure.
	# r"[7-9]\d{9}$" is broken down like this:
	# [7-9]means the string has to start iwht a 7,8, or 9
	# \d{9} means the the next 9 chracters have to be digits
	# $ It tells the computer that the match must occur at the end of the string or before \n at the end of the line or string
    if(match):
        print("YES")
    else:
        print("NO")