# You are given a set A and other n sets.
# Your job is to find whether set A is a strict superset of each of the N sets.

# Print True, if A is a strict superset of each of the N sets. Otherwise, print False.

# A strict superset has at least one element that does not exist in its subset.

# Example
# Set([1,3,4]) is a strict superset of Set([1,3]).
# Set([1,3,4]) is not a strict superset of Set([1,3,4]).
# Set([1,3,4]) is not a strict superset of Set([1,3,5]).

# Input Format

# The first line contains the space separated elements of set A.
# The second line contains integer n, the number of other sets.
# The next n lines contains the space separated elements of the other sets.

# Constraints
# 0<len(set(A))<501
# 0 < N < 21
# 0 < len(otherSets) < 101

# Output Format

# Print True if set A is a strict superset of all N sets. Otherwise, print False.

# Sample Input 0

# 1 2 3 4 5 6 7 8 9 10 11 12 23 45 84 78
# 2
# 1 2 3 4 5
# 100 11 12

# Sample Output 0

# False

# Explanation 0

# Set A is the strict superset of the Set([1,2, 3,4, 5]) but not of the Set([100,11,12]) because 100 is not in set A.
# Hence, the output is False.



setA = set(map(int, input().split()))
numberOfTestCases= int(input("How many test cases are we working with: \n"))
numberOfSubsets = 0

for value in range(numberOfTestCases):
    #create set of integers using a map. Space separated values are cast to integers and then converted to a set
    #map() function returns a list of the results after applying the given function to each item of a given iterable (list, tuple etc.)
    #so set1 and set2 are equal to the mapping on integers to the input that is split by spaces. That input in converted to a set and assigned to set1 and set2

    setB = set(map(int, input().split()))

    if(setA.issuperset(setB)):
        numberOfSubsets = numberOfSubsets+1

print(numberOfSubsets == numberOfTestCases)