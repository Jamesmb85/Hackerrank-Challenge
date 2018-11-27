# Concatenate

# Two or more arrays can be concatenated together using the concatenate function with a tuple of the arrays to be joined:

# import numpy

# array_1 = numpy.array([1,2,3])
# array_2 = numpy.array([4,5,6])
# array_3 = numpy.array([7,8,9])

# print numpy.concatenate((array_1, array_2, array_3))    

Output
# [1 2 3 4 5 6 7 8 9]

# If an array has more than one dimension, it is possible to specify the axis along which multiple arrays are concatenated. By default, it is along the first dimension.

# import numpy

# array_1 = numpy.array([[1,2,3],[0,0,0]])
# array_2 = numpy.array([[0,0,0],[7,8,9]])

# print numpy.concatenate((array_1, array_2), axis = 1)   

Output
# [[1 2 3 0 0 0]
 # [0 0 0 7 8 9]]    

# Task

# You are given two integer arrays of size NxP and MxP (N & M are rows, and P is the column). 
# Your task is to concatenate the arrays along axis 0.

# Input Format

# The first line contains space separated integers N,M and P.
# The next lines contains the space separated elements of the P columns.
# After that, the next M lines contains the space separated elements of the P columns.

# Output Format

# Print the concatenated array of size (N+M)xP.

# Sample Input

# 4 3 2
# 1 2
# 1 2 
# 1 2
# 1 2
# 3 4
# 3 4
# 3 4 

# Sample Output

# [[1 2]
 # [1 2]
 # [1 2]
 # [1 2]
 # [3 4]
 # [3 4]
 # [3 4]] 




n,m,p = map(int, input().split())
#the int function is being mapped to the input function. so int is mapped to 4 3 2
worklist1 = numpy.array([input().split() for value in range(n)], int)
worklist2 = numpy.array([input().split() for value in range(m)], int)
#create two list with list compression. one of size n and the other of size map
#the values are input.split() that are case as an int
print(numpy.concatenate((worklist1,worklist2), axis=0))

