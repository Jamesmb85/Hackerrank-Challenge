# You have a record of N students. Each record contains the student's name, and their percent marks in Maths, Physics and Chemistry. 
#The marks can be floating values. The user enters some integer N followed by the names and marks for N students. 
#You are required to save the record in a dictionary data type. The user then enters a student's name. 
#Output the average percentage marks obtained by that student, correct to two decimal places.

# Input Format

# The first line contains the integer N, the number of students. The next N lines contains the name and marks obtained by that student separated by a space. 
#The final line contains the name of a particular student previously listed.

# Constraints
# 2<=N<=10
# 0<Marks<=100

# Output Format

# Print one line: The average of the marks obtained by the particular student correct to 2 decimal places.

# Sample Input 0

# 3
# Krishna 67 68 69
# Arjun 70 98 63
# Malika 52 56 60
# Malika

# Sample Output 0

# 56.00

# Explanation 0

# Marks for Malika are whose average is

# Sample Input 1

# 2
# Harsh 25 26.5 28
# Anurag 26 28 30
# Harsh

# Sample Output 1

# 26.50




if __name__ == '__main__':
    n = int(input())
    student_marks = {} #create empty dictionary
    for _ in range(n):
        name, *line = input().split() #read in first and last name. Split method spearates first ane last name
        scores = list(map(float, line)) #scores are a list and assign to a variable
        student_marks[name] = scores #list of scores is assigned as the values for each name(key) 
    
	query_name = input() #input the name with want to query
    #need the return the values of a certain key
    list_of_scores = student_marks[query_name] #return the list of values for the key(name)
	
    #need to iterate through the list of values and sum them
    sum = 0
    for value in list_of_scores:
        sum+=value
    #print out the average score which is the sum of the values for a query_name divided by the length of the 
    print("{0:.2f}".format(sum/len(list_of_scores)))