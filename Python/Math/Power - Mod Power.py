# So far, we have only heard of Python's powers. Now, we will witness them!

# Powers or exponents in Python can be calculated using the built-in power function. Call the power function a**b as shown below:

# >>> pow(a,b) 

# or

# >>> a**b

# It's also possible to calculate a**b mod m.

# >>> pow(a,b,m)  

# This is very helpful in computations where you have to print the resultant % mod.

# Note: Here, a and b can be floats or negatives, but, if a third argument is present, b cannot be negative.

# Note: Python has a math module that has its own pow(). It takes two arguments and returns a float. Frankly speaking, we will never use math.pow().

# Task
# You are given three integers: a, b, and m, respectively. Print two lines.
# The first line should print the result of pow(a,b). The second line should print the result of pow(a,b,m).

# Input Format
# The first line contains a, the second line contains b, and the third line contains m.

# Constraints
# 1<=a<=10
# 1<=b<=10
# 2<=m<=1000


# Sample Input

# 3
# 4
# 5

# Sample Output

# 81
# 1


number1 = int(input("Enter a number: \n"))
number2 = int(input("Enter a number: \n"))
number3 = int(input("Enter a number: \n"))
print(pow(number1, number2))
print(pow(number1, number2, number3))