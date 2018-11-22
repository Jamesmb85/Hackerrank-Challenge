# You are given a string S.
# Your task is to find out whether S is a valid regex or not.

# Input Format

# The first line contains integer T, the number of test cases.
# The next lines contains the string S.

# Constraints
# 0<T<100

# Output Format

# Print "True" or "False" for each test case without quotes.

# Sample Input

# 2
# .*\+
# .*+

# Sample Output

# True
# False

# Explanation

# .*\+ : Valid regex.
# .*+: Has the error multiple repeat. Hence, it is invalid.


number_of_test_cases = int(input("Enter the number of test cases: "))
for values in range(number_of_test_cases):
    try:
        test_case = bool(re.compile(input()))
		# Function compile()
		# Regular expressions are compiled into pattern objects, which have methods for various operations such 
		# as searching for pattern matches or performing string substitutions.
		# re.compile(input())creates a regular expression for whatever is entered
		# Bool returns true or false if re.compile(input()) was successful or not
		# If false, an re.error is raised
        print(test_case)
    except re.error as err:
        print("False")