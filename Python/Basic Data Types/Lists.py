# Consider a list (list = []). You can perform the following commands:

    # insert i e: Insert integer at position .
    # print: Print the list.
    # remove e: Delete the first occurrence of integer .
    # append e: Insert integer at the end of the list.
    # sort: Sort the list.
    # pop: Pop the last element from the list.
    # reverse: Reverse the list.

# Initialize your list and read in the value of n followed by lines of commands where each command will be of the 7 types listed above. 
# Iterate through each command in order and perform the corresponding operation on your list.

# Input Format

# The first line contains an integer, n, denoting the number of commands.
# Each line i of the subsequent lines contains one of the commands described above.

# Constraints

    # The elements added to the list must be integers.

# Output Format

# For each command of type print, print the list on a new line.

# Sample Input 0

# 12
# insert 0 5
# insert 1 10
# insert 0 6
# print
# remove 6
# append 9
# append 1
# sort
# print
# pop
# reverse
# print

# Sample Output 0

# [6, 5, 10]
# [1, 5, 9, 10]
# [9, 5, 1]





numberOfOperations = int(input("How many operations do you want to perform on the list: \n"))
workingList = []
def listOption():
    print("You can do the following: \n")
    print("insert value at a certain position. Type in insert: \n")
    print("Print the list. Type in print: \n")
    print("Remove value. Only removes the first occurrence. Type in remove: \n")
    print("Append value at the end of the list. Type in append: \n")
    print("Sort the list. Type in sort: \n")
    print("Pop off value from the end of the list. Type in pop: \n")
    print("Reverse the list. Type in reverse: \n")


listOption() ##call method
for value in range(numberOfOperations):
    print("\n")
    operation = input("What operation do you want to do on the list: \n").lower() #make input lowercase

    if(operation == "insert"):
         position = int(input("What position do you want to insert the number: \n"))
         number = int(input("What number do you want to insert: \n"))
         workingList.insert(position,number)
    elif(operation == "print"):
        print(workingList)
    elif(operation == "remove"):
        number = int(input("What number do you want to remove: \n"))
        workingList.remove(number)
    elif(operation == "append"):
        number = int(input("What number do you want to add to the end of the list: \n"))
        workingList.append(number)
    elif(operation == "sort"):
        workingList.sort()
    elif(operation == "pop"):
        workingList.pop();
    elif(operation == "reverse"):
        workingList.reverse()
    else:
        print("You didn't enter a valid operation")