# Given a list of rational numbers,find their product.

# Concept
# The reduce() function applies a function of two arguments cumulatively on a list of objects 
# in succession from left to right to reduce it to one value. Say you have a list, say [1,2,3] and you have to find its sum.

# >>> reduce(lambda x, y : x + y,[1,2,3])
# 6

# You can also define an initial value. If it is specified, the function will assume initial value as the value given, 
# and then reduce. It is equivalent to adding the initial value at the beginning of the list. For example:

# >>> reduce(lambda x, y : x + y, [1,2,3], -3)
# 3

# >>> from fractions import gcd
# >>> reduce(gcd, [2,4,8], 3)
# 1

# Input Format

# First line contains n, the number of rational numbers.
# The ith of next n lines contain two integers each, the numerator(Ni ) and denominator(Di ) of the ith rational number in the list.

# Constraints
# 0<=N<=100
# 1 <=Ni, Di <=10**9 

# Output Format

# Print only one line containing the numerator and denominator of the product of the numbers in the list in 
# its simplest form, i.e. numerator and denominator have no common divisor other than 1.

# Sample Input 0

# 3
# 1 2
# 3 4
# 10 6

# Sample Output 0

# 5 8

# Explanation 0

# Required product is (1/2)*(3/4)*(10/6)




from fractions import Fraction
from functools import reduce

def product(fracs):

	# The reduce(fun,seq) function is used to apply a particular function passed in its argument to all of the list 
	# elements mentioned in the sequence passed along.This function is defined in “functools” module.

	# Working : 

    # At first step, first two elements of sequence are picked and the result is obtained.
    
	# Next step is to apply the same function to the previously attained result and the number 
	# just succeeding the second element and the result is again stored.
    
	# This process continues till no more elements are left in the container.
    
	# The final returned result is returned and printed on console.

    t =  reduce(lambda x, y : x * y, fracs) # complete this line with a reduce statement
	
	#so our lambda function has 2 arguments(x,y) and the expression(x * y) is applied to fracs
    return t.numerator, t.denominator
	
if __name__ == '__main__':
    fracs = []
    for _ in range(int(input())):
        fracs.append(Fraction(*map(int, input().split())))
    result = product(fracs)
    print(*result)