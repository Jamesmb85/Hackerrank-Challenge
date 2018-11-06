# zip([iterable, ...])

# This function returns a list of tuples. The ith tuple contains the ith element from each of the argument sequences or iterables.

# If the argument sequences are of unequal lengths, then the returned list is truncated to the length of the shortest argument sequence.

# Sample Code

# >>> print zip([1,2,3,4,5,6],'Hacker')
# [(1, 'H'), (2, 'a'), (3, 'c'), (4, 'k'), (5, 'e'), (6, 'r')]
# >>> 
# >>> print zip([1,2,3,4,5,6],[0,9,8,7,6,5,4,3,2,1])
# [(1, 0), (2, 9), (3, 8), (4, 7), (5, 6), (6, 5)]
# >>> 
# >>> A = [1,2,3]
# >>> B = [6,5,4]
# >>> C = [7,8,9]
# >>> X = [A] + [B] + [C]
# >>> 
# >>> print zip(*X)
# [(1, 6, 7), (2, 5, 8), (3, 4, 9)]

# Task

# The National University conducts an examination of N students in X subjects.
# Your task is to compute the average scores of each student.

# Average = (Sum of all scores for each student in each subject)/ (Total Number of subjects) 

# The format for the general mark sheet is:

# Student ID → ___1_____2_____3_____4_____5__               
# Subject 1   |  89    90    78    93    80
# Subject 2   |  90    91    85    88    86  
# Subject 3   |  91    92    83    89    90.5
            # |______________________________
# Average        90    91    82    90    85.5 

# Input Format

# The first line contains N and X separated by a space.
# The next X lines contains the space separated marks obtained by students in a particular subject.

# Constraints
# 0<N<=100
# 0<X<=100

# Output Format

# Print the averages of all students on separate lines.

# The averages must be correct up to 1 decimal place.

# Sample Input

# 5 3
# 89 90 78 93 80
# 90 91 85 88 86  
# 91 92 83 89 90.5

# Sample Output

# 90.0 
# 91.0 
# 82.0 
# 90.0 
# 85.5        

# Explanation

# Marks obtained by student 1: 89, 90, 91
# Average marks of student 1: 270/3 = 90
# Marks obtained by student 2: 90, 91, 92
# Average marks of student 2: 273/3 = 91
# Marks obtained by student 3: 78, 85, 83
# Average marks of student 3: 246/3 = 82
# Marks obtained by student 4: 93, 88, 89
# Average marks of student 4: 270/3 = 90
# Marks obtained by student 5: 80, 86, 90.5
# Average marks of student 5: 256.5 / 3 = 85.5




print("Enter the number of number of subjects and subjects the student is taking \n")
number_of_subjects, number_of_students = map(int, input().split())
working_list = []
for student in range(0, number_of_students):
    #need fill in the working_list with space separated number. each append call is one student's grades
    working_list.append( map(float, input().split()) )

#The purpose of zip() is to map the similar index of multiple containers so that they can be used just using as single entity.
#use the *working_list pass in as many arguments as we want as a tuple
for student in zip(*working_list):
    print(sum(student)/ len(student))