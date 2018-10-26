# Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. 
# You are given n scores. Store them in a list and find the score of the runner-up.

# Input Format

# The first line contains n. The second line contains an array A[] of integers each separated by a space.

# Constraints
# 2<=N<=10
# -100<=A[i]<=100

# Output Format

# Print the runner-up score.

# Sample Input 0

# 5
# 2 3 6 6 5

# Sample Output 0

# 5

# Explanation 0

# Given list is [2,3,5,6,6]. The maximum score is 6, second maximum is 5. Hence, we print 5 as the runner-up score. 


if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    print(sorted(set(arr))[-2])
    #this line convert the map to a set to remove the duplicates
    #sorted perfroms in-place sorting so we have a set of all unqique numbers in ascending order
    #-2 is the second to last number