# Integers in Python can be as big as the bytes in your machine's memory. 
# There is no limit in size as there is: (2**31)-1 (c++ int) or (2**63)-1 (C++ long long int).

# As we know, the result of a**b grows really fast with increasing b.

# Let's do some calculations on very large integers.

# Task
# Read four numbers, a, b, c, and d, and print the result of (a**b) + (c**d)

# .

# Input Format
# Integers a, b, c, and d are given on four separate lines, respectively.

# Constraints
# 1<=a<=1000
# 1<=b<=1000
# 1<=c<=1000
# 1<=d<=1000


# Output Format
# Print the result of (a**b) + (c**d) on one line.

# Sample Input

# 9
# 29
# 7
# 27

# Sample Output

# 4710194409608608369201743232  




number1 = int(input("Enter a number: \n"))
number2 = int(input("Enter a number: \n"))
number3 = int(input("Enter a number: \n"))
number4 = int(input("Enter a number: \n"))
print(pow(number1,number2) + pow(number3,number4))