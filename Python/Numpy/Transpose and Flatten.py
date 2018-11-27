# Transpose

# We can generate the transposition of an array using the tool numpy.transpose.
# It will not affect the original array, but it will create a new array.

# import numpy

# my_array = numpy.array([[1,2,3],
                        # [4,5,6]])
# print numpy.transpose(my_array)

Output
# [[1 4]
 # [2 5]
 # [3 6]]

# Flatten

# The tool flatten creates a copy of the input array flattened to one dimension.

# import numpy

# my_array = numpy.array([[1,2,3],
                        # [4,5,6]])
# print my_array.flatten()

Output
# [1 2 3 4 5 6]

# Task

# You are given a NxM integer array matrix with space separated elements ( N= rows and M= columns).
# Your task is to print the transpose and flatten results.

# Input Format

# The first line contains the space separated values of N and M.
# The next lines contains the space separated elements of M columns.

# Output Format

# First, print the transpose array and then print the flatten.

# Sample Input

# 2 2
# 1 2
# 3 4

# Sample Output

# [[1 3]
 # [2 4]]
# [1 2 3 4]



n, m = map(int, input().split())
#the int function is being mapped to the input function. so int is mapped to 2 2
working_array = numpy.array( [input().strip().split() for value in range(m)] )
#list compression where a list i created m times and the result is input().strip().split()
print("Flatten Array: \n", working_array.flatten())
print ("Transpose of array:\n", numpy.transpose(working_array))