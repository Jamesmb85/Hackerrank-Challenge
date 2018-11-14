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


from collections import namedtuple
number_of_students = int(input("Enter the number of the students: \n"))
fields = input().split() #read in the fields
total = 0
for student in range(number_of_students):
    #create our namedtuple from the fields above
    students = namedtuple("Student", fields)
    field1, field2, field3, field4 = input().split() #read in the fields
    singleStudent = students(field1, field2, field3, field4) #create an Students insstance and assign the fields
    total += int(singleStudent.MARKS) #Marks is one of the fields and we are calling it and its value is added to the total field

print('{:.2f}'.format(total/number_of_students))
