#This is my solution but it timed out for very large inputs
# Enter your code here. Read input from STDIN. Print output to STDOUT
size_of_group = int( input() )
room_numbers = input()

#create a list of the room numbers
workinglist = room_numbers.split(" ")
#create a set of the list
workingset = set(workinglist)

#we need to iterate through and identify the element whose count is less than the size_of_group
for value in workingset:
    x = workinglist.count(value)
    if(x < size_of_group):
        print(value)
		

		
#this solution was accepted by hackerrank		
# Enter your code here. Read input from STDIN. Print output to STDOUT
size_of_group = int( input("") )
room_numbers = input("")

#create a list of the room numbers
workinglist = room_numbers.split(" ")
#create 2 sets
set1 = set()
set2 = set()

#we need to iterate through the workinglist and put unique number in one set and repeats in another
for value in workinglist:
    if value in set1:
        #value already exist so add it to the other set
        set2.add(value)
    else:
        set1.add(value)

set3 = set1.difference(set2)
print(*set3)



