# A deque is a double-ended queue. It can be used to add or remove elements from both ends.

# Deques support thread safe, memory efficient appends and pops from either side of the deque with approximately the same O(1) performance in either direction.

# Example

# Code

# >>> from collections import deque
# >>> d = deque()
# >>> d.append(1)
# >>> print d
# deque([1])
# >>> d.appendleft(2)
# >>> print d
# deque([2, 1])
# >>> d.clear()
# >>> print d
# deque([])
# >>> d.extend('1')
# >>> print d
# deque(['1'])
# >>> d.extendleft('234')
# >>> print d
# deque(['4', '3', '2', '1'])
# >>> d.count('1')
# 1
# >>> d.pop()
# '1'
# >>> print d
# deque(['4', '3', '2'])
# >>> d.popleft()
# '4'
# >>> print d
# deque(['3', '2'])
# >>> d.extend('7896')
# >>> print d
# deque(['3', '2', '7', '8', '9', '6'])
# >>> d.remove('2')
# >>> print d
# deque(['3', '7', '8', '9', '6'])
# >>> d.reverse()
# >>> print d
# deque(['6', '9', '8', '7', '3'])
# >>> d.rotate(3)
# >>> print d
# deque(['8', '7', '3', '6', '9'])

# Task

# Perform append, pop, popleft and appendleft methods on an empty deque d.

# Input Format

# The first line contains an integer N, the number of operations.
# The next N lines contains the space separated names of methods and their values.

# Constraints
# 0<N<=100

# Output Format

# Print the space separated elements of deque d.

# Sample Input

# 6
# append 1
# append 2
# append 3
# appendleft 4
# pop
# popleft

# Sample Output

# 1 2



from collections import deque
#create an empty deque
workingDeque = deque()
number_of_operations = int(input('Enter the number of operations on the deque: \n'))

for value in range(number_of_operations):
    operation = input().split()

    if(operation[0] == "append"):
        workingDeque.append(operation[1])
    elif(operation[0] == "pop"):
        workingDeque.pop()
    elif(operation[0] == "popleft"):
        workingDeque.popleft()
    elif(operation[0] == "appendleft"):
        workingDeque.appendleft(operation[1])

print(*workingDeque) #print out the unpack values
