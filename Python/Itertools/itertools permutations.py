# This tool returns successive r length permutations of elements in an iterable.

# If r is not specified or is None,  r defaults to the length of the iterable, and all possible full length permutations are generated.

# Permutations are printed in a lexicographic sorted order. So, if the input iterable is sorted, the permutation tuples will be produced in a sorted order.

# Sample Code

# >>> from itertools import permutations
# >>> print permutations(['1','2','3'])
# <itertools.permutations object at 0x02A45210>
# >>> 
# >>> print list(permutations(['1','2','3']))
# [('1', '2', '3'), ('1', '3', '2'), ('2', '1', '3'), ('2', '3', '1'), ('3', '1', '2'), ('3', '2', '1')]
# >>> 
# >>> print list(permutations(['1','2','3'],2))
# [('1', '2'), ('1', '3'), ('2', '1'), ('2', '3'), ('3', '1'), ('3', '2')]
# >>>
# >>> print list(permutations('abc',3))
# [('a', 'b', 'c'), ('a', 'c', 'b'), ('b', 'a', 'c'), ('b', 'c', 'a'), ('c', 'a', 'b'), ('c', 'b', 'a')]

# Task

# You are given a string S.
# Your task is to print all possible permutations of size k of the string in lexicographic sorted order.

# Input Format

# A single line containing the space separated string S and the integer value k.

# Constraints
# 0<=K<=len(s)

# The string contains only UPPERCASE characters.

# Output Format

# Print the permutations of the string S on separate lines.

# Sample Input

# HACK 2

# Sample Output

# AC
# AH
# AK
# CA
# CH
# CK
# HA
# HC
# HK
# KA
# KC
# KH

# Explanation

# All possible size 2 permutations of the string "HACK" are printed in lexicographic sorted order.


from itertools import permutations
a, b = input().split() #read in the string and the size of the permutation

# Let's break what is happening here:
# 1. sorted a is sorting the string in lexicographical order
# 2. b is cast as an int
# 3. permutations(), which accepts a single iterable (the string a)
# and produces all possible permutations (rearrangements) of its elements of size int(b)
# 4. the loop is taking each permutation of size 2 and joining it to an empty string(which is the delimeter). 
[print(''.join(i)) for i in permutations(sorted(a), int(b))]