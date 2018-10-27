""" .symmetric_difference()

The .symmetric_difference() operator returns a set with all the elements that are in the set and the iterable but not both.
Sometimes, a ^ operator is used in place of the .symmetric_difference() tool, but it only operates on the set of elements in set.
The set is immutable to the .symmetric_difference() operation (or ^ operation).

>>> s = set("Hacker")
>>> print s.symmetric_difference("Rank")
set(['c', 'e', 'H', 'n', 'R', 'r'])

>>> print s.symmetric_difference(set(['R', 'a', 'n', 'k']))
set(['c', 'e', 'H', 'n', 'R', 'r'])

>>> print s.symmetric_difference(['R', 'a', 'n', 'k'])
set(['c', 'e', 'H', 'n', 'R', 'r'])

>>> print s.symmetric_difference(enumerate(['R', 'a', 'n', 'k']))
set(['a', 'c', 'e', 'H', (0, 'R'), 'r', (2, 'n'), 'k', (1, 'a'), (3, 'k')])

>>> print s.symmetric_difference({"Rank":1})
set(['a', 'c', 'e', 'H', 'k', 'Rank', 'r'])

>>> s ^ set("Rank")
set(['c', 'e', 'H', 'n', 'R', 'r'])

Task

Students of District College have subscriptions to English and French newspapers. Some students have subscribed to English only, some have subscribed to French only, and some have subscribed to both newspapers.

You are given two sets of student roll numbers. One set has subscribed to the English newspaper, and one set has subscribed to the French newspaper. Your task is to find the total number of students who have subscribed to either the English or the French newspaper but not both.

Input Format

The first line contains an integer, n, the number of students who have subscribed to the English newspaper.
The second line contains n space separated roll numbers of those students.
The third line contains b, the number of students who have subscribed to the French newspaper.
The fourth line contains b space separated roll numbers of those students.

Constraints
0<Totoal Number of Students<1000

Output Format

Output total number of students who have subscriptions to the English or the French newspaper but not both.

Sample Input

9
1 2 3 4 5 6 7 8 9
9
10 1 2 3 11 21 55 6 8

Sample Output

8

Explanation

The roll numbers of students who have subscriptions to English or French newspapers but not both are: 4,5,7,9,10,11,21 and 55.
Hence, the total is 8 students.  """


numberOfElementsInList1 = int(input("How many elements are in the set: \n"))
list1 = input() #enter integers with a space in-between
numberOfElementsInList2 = int(input("How many elements are in the set: \n"))
list2 = input() #enter integers with a space in-between

workingList1 = list1.split(" ") #split the integers and assign to a list
workingList2 = list2.split(" ") #split the integers and assign to a list

set1 = set(workingList1) #convert list to a set
set2 = set(workingList2) #convert list to a set

#Returns a union of two set.Using the ‘|’ operator between 2 sets is the same as writing set1.union(set2)
set3 = set1.symmetric_difference(set2)

print(len(set3)) #print the length of the set

