# Basically, namedtuples are easy to create, lightweight object types.
# They turn tuples into convenient containers for simple tasks.
# With namedtuples, you don't have to use integer indices for accessing members of a tuple.

# Example

# Code 01

# >>> from collections import namedtuple
# >>> Point = namedtuple('Point','x,y')
# >>> pt1 = Point(1,2)
# >>> pt2 = Point(3,4)
# >>> dot_product = ( pt1.x * pt2.x ) +( pt1.y * pt2.y )
# >>> print dot_product
# 11

# Code 02

# >>> from collections import namedtuple
# >>> Car = namedtuple('Car','Price Mileage Colour Class')
# >>> xyz = Car(Price = 100000, Mileage = 30, Colour = 'Cyan', Class = 'Y')
# >>> print xyz
# Car(Price=100000, Mileage=30, Colour='Cyan', Class='Y')
# >>> print xyz.Class
# Y

# Task

# Dr. John Wesley has a spreadsheet containing a list of student's IDs, MARKS, NAME, and class.

# Your task is to help Dr. Wesley calculate the average marks of the students.

# Note:
# 1. Columns can be in any order. IDs, marks, class and name can be written in any order in the spreadsheet.
# 2. Column names are ID, MARKS, CLASS and NAME. (The spelling and case type of these names won't change.)

# Input Format

# The first line contains an integer N, the total number of students.
# The second line contains the names of the columns in any order.
# The next N lines contains the IDs, MARKS, NAME, and class under their respective column names.

# Constraints
# 0<N<=100

# Output Format

# Print the average marks of the list corrected to 2 decimal places.

# Sample Input

# TESTCASE 01

# 5
# ID         MARKS      NAME       CLASS     
# 1          97         Raymond    7         
# 2          50         Steven     4         
# 3          91         Adrian     9         
# 4          72         Stewart    5         
# 5          80         Peter      6   

# TESTCASE 02

# 5
# MARKS      CLASS      NAME       ID        
# 92         2          Calum      1         
# 82         5          Scott      2         
# 94         2          Jason      3         
# 55         8          Glenn      4         
# 82         2          Fergus     5

# Sample Output

# TESTCASE 01

# 78.00

# TESTCASE 02

# 81.00

# Explanation

# TESTCASE 01

# Can you solve this challenge in 4 lines of code or less?
# NOTE: There is no penalty for solutions that are correct but have more than 4 line


#import Collections module
from collections import namedtuple

#cast input as an int
total_number_of_students = int(input("Enter the total number of students: "))

#names of the columns. We don't know the order so we will just create a list.
#The split function returns a list of strings separated by the a delimeter
column_names = input().split()

#average grade
average_grade = 0

#we need to loop for each student
#We use the underscore(_) in the loop since we aren't using the value in range in our computation
for _ in range(total_number_of_students):
    # Declaring namedtuple()
    #namedTuple takes in a list as the second parameter
    Student = namedtuple('Student',column_names)

    #for each student enter the column names. The problem states they aren't the same for each student so we need to input them
    column1, column2, column3, column4 = input().split()

    #assign the columns to namedTuple Instance
    S = Student(column1, column2, column3, column4)

    #for each student we need to access the MARKS column
    #All of the columns are strings so we need to cast as an int
    #we need to add all of the MARKS and find the average
    average_grade +=  int(S.MARKS)/total_number_of_students

#print out the average grade
print("{:.2f}".format(average_grade))
