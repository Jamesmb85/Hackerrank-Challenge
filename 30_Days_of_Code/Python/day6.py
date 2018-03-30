# Task
# Given a string, S, of length N that is indexed from 0 to N - 1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line 
# (see the Sample below for more detail).
# Note: 0 is considered to be an even index. 

# Input Format

# The first line contains an integer T, (the number of test cases).
# Each line i of the T subsequent lines contain a String, S.

# Constraints
# 1 <= T <= 10
# 2 <= lenght of S <= 10000

# Sample Input

# 2
# Hacker
# Rank

# Sample Output

# Hce akr
# Rn ak


number = int(raw_input(''))

i = 0 #counter for outer while loop

while i < number:
	word = raw_input('')
	print word[::2], word[1::2] 
	i = i + 1



#########################HackerrankSolution##########################################################################
for value in range(int(raw_input(''))): #raw_input is converted into an int and that number is used to determine the number of iterations of the loop
	word = raw_input('') #in the loop you input the word you want to slice
	print word[ : : 2] , word[1 : : 2] #[ : : 2] return every other letter in the string starting at index 0. [1 : : 2] return every other letter starting at index 1
#########################HackerrankSolution##########################################################################