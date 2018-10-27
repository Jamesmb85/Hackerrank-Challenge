""" .intersection()

The .intersection() operator returns the intersection of a set and the set of elements in an iterable.
Sometimes, the & operator is used in place of the .intersection() operator, but it only operates on the set of elements in set.
The set is immutable to the .intersection() operation (or & operation).

>>> s = set("Hacker")
>>> print s.intersection("Rank")
set(['a', 'k'])

>>> print s.intersection(set(['R', 'a', 'n', 'k']))
set(['a', 'k'])

>>> print s.intersection(['R', 'a', 'n', 'k'])
set(['a', 'k'])

>>> print s.intersection(enumerate(['R', 'a', 'n', 'k']))
set([])

>>> print s.intersection({"Rank":1})
set([])

>>> s & set("Rank")
set(['a', 'k'])

Task

The students of District College have subscriptions to English and French newspapers. Some students have subscribed only to English, some have subscribed only to French, and some have subscribed to both newspapers.

You are given two sets of student roll numbers. One set has subscribed to the English newspaper, one set has subscribed to the French newspaper. Your task is to find the total number of students who have subscribed to both newspapers.

Input Format

The first line contains an integer, n, the number of students who have subscribed to the English newspaper.
The second line contains n space separated roll numbers of those students.
The third line contains b, the number of students who have subscribed to the French newspaper.
The fourth line contains b space separated roll numbers of those students.

Constraints
0<Totoal Number of Students<1000

Output Format

Output the total number of students who have subscriptions to both English and French newspapers.

Sample Input

9
1 2 3 4 5 6 7 8 9
9
10 1 2 3 11 21 55 6 8

Sample Output

5

Explanation

The roll numbers of students who have both subscriptions: 1,2,3,6 and 8.
Hence, the total is 5 students.   """


numberOfElementsInList1 = int(input("How many elements are in the set: \n"))
list1 = input() #enter integers with a space in-between
numberOfElementsInList2 = int(input("How many elements are in the set: \n"))
list2 = input() #enter integers with a space in-between

workingList1 = list1.split(" ") #split the integers and assign to a list
workingList2 = list2.split(" ") #split the integers and assign to a list

set1 = set(workingList1) #convert list to a set
set2 = set(workingList2) #convert list to a set

#Returns a union of two set.Using the ‘|’ operator between 2 sets is the same as writing set1.union(set2)
set3 = set1.intersection(set2)

print(len(set3)) #print the length of the set