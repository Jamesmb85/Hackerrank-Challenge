# Given the names and grades for each student in a class of N

# students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

# Note: If there are multiple students with the second lowest grade, order their names alphabetically and print 
# each name on a new line.

# Example
# The ordered list of scores is [20.0, 50.0] , so the second lowest score is 50. There are two students with that score:

# . Ordered alphabetically, the names are printed as:

# alpha
# beta

# Input Format

# The first line contains an integer,
# , the number of students.
# The subsequent lines describe each student over

# lines.
# - The first line contains a student's name.
# - The second line contains their grade.

# Constraints

    # There will always be one or more students having the second lowest grade.

# Output Format

# Print the name(s) of any student(s) having the second lowest grade in. If there are multiple students, order their names alphabetically and print each one on a new line.

# Sample Input 0

# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39

# Sample Output 0

# Berry
# Harry

# Explanation 0

# There are

# students in this class whose names and grades are assembled to build the following list:

# python students = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41], ['Harsh', 39]]

# The lowest grade of
# belongs to Tina. The second lowest grade of belongs to both Harry and Berry, so we order their names alphabetically and print each name on a new line.



listOfStudents = []
listOfGrades = []
listOfStudentsWithSecondLowestScore = []
numberOfStudents = int(input("How many students are in the class: \n"))
for student in range(numberOfStudents):
    studentName = input("What is the student's first name: \n")
    grade = float(input("What is their grade: \n"))
    #place students and grades in list. This list is how all of the students
    listOfStudents.append([studentName, grade])
    #place all of the game in a list
    listOfGrades.append(grade)

#need to find the second lowest grade.
unique_grades = sorted(set(listOfGrades)) #remove duplicares and sort the set
secondHighestGrade = unique_grades[1] #assign the second value in the set

#we now need to iterate through the listOfStudents list and add their names to the list
for student in listOfStudents:
    if(secondHighestGrade == student[1]):
        listOfStudentsWithSecondLowestScore.append(student[0])

#print out students
for name in listOfStudentsWithSecondLowestScore:
    print(name)
