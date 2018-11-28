# sum

# The sum tool returns the sum of array elements over a given axis.

# import numpy

# my_array = numpy.array([ [1, 2], [3, 4] ])

# print numpy.sum(my_array, axis = 0)         #Output : [4 6]
# print numpy.sum(my_array, axis = 1)         #Output : [3 7]
# print numpy.sum(my_array, axis = None)      #Output : 10
# print numpy.sum(my_array)                   #Output : 10

# By default, the axis value is None. Therefore, it performs a sum over all the dimensions of the input array.

# prod

# The prod tool returns the product of array elements over a given axis.

# import numpy

# my_array = numpy.array([ [1, 2], [3, 4] ])

# print numpy.prod(my_array, axis = 0)            #Output : [3 8]
# print numpy.prod(my_array, axis = 1)            #Output : [ 2 12]
# print numpy.prod(my_array, axis = None)         #Output : 24
# print numpy.prod(my_array)                      #Output : 24

# By default, the axis value is None. Therefore, it performs the product over all the dimensions of the input array.

# Task

# You are given a 2-D array with dimensions NxM.
# Your task is to perform the tool over axis and then find the product of that result.

# Input Format

# The first line of input contains space separated values of N and M.
# The next N lines contains M space separated integers.

# Output Format

# Compute the sum along axis 0. Then, print the product of that sum.

# Sample Input

# 2 2
# 1 2
# 3 4

# Sample Output

# 24

# Explanation

# The sum along axis 0 = [4,6]
# The product of this sum = 24

import numpy
n, m = map(int, input().split())
#the int function is being mapped to the input function. so int is mapped to 2 2
workingarray = numpy.array( [input().strip().split() for _ in range(n)], int)
#[input().strip().split() for _ in range(n)] list compression that the values in the list are input().strip().split() and it is being filled n times
#the lists are used to create an array. numpy.array([1,2], [3,4])
print( numpy.prod(numpy.sum(workingarray, axis=0), axis=0) )
#numpy.sum(workingarray, axis=0) find the sum of [1,2], [3,4] along axis 0 which is [4,6]
#numpy.prod([4,6]) is 24
