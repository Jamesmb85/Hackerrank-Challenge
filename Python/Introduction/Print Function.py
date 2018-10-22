# Read an integer N.
# Without using any string methods, try to print the following: 123...N
# Note that "..." represents the values in between.
# Input Format
# The first line contains an integer N.
# Output Format
# Output the answer as explained in the task.
# Sample Input:
# 3
# Sample Output:
# 123

if __name__ == '__main__':
    n = int(input())
    for i in range(n):
	 # Python's print() function comes with a parameter called ‘end’. 
	 # By default, the value of this parameter is '\n', i.e. the new line character. 
	 # You can end a print statement with any character/string using this parameter.
        print(i+1, end = "")