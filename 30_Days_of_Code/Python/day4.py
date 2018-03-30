# Objective
# In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept, 
# it's only enabled in certain languages. Check out the Tutorial tab for learning materials and an instructional video! 


# Task 
# Write a Person class with an instance variable, age , and a constructor that takes an integer, initialAge , as a parameter. 
# The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; 
# if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.
# In addition, you must write the following instance method

# yearPasses() should increase age the instance variable by 1.

# amIOld() should perform the following conditional actions:
	# If age < 13, print You are young..
    # If age >= 13 and age < 18, print You are a teenager..
    # Otherwise, print You are old.
	
# To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. 
# The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

# Note: Do not remove or alter the stub code in the editor.

# Input Format

# Input is handled for you by the stub code in the editor.

# The first line contains an integer T, (the number of test cases), and the T subsequent lines each contain an integer denoting the age of a Person instance.


# Constraints
# 1 <= T <= 4
# -5 <= age <= 30



# Output Format

# Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. 
# If your methods are implemented correctly, each test case will print or lines (depending on whether or not a valid initialAge was passed to the constructor).


class Person:
    def __init__(self,initialAge):
        # Add some more code to run some checks on initialAge
		self.initialAge = initialAge
    def amIOld(self):
        # Do some computations in here and print out the correct statement to the console
		if self.initialAge < 0: #if this line is true, you can't use elif because the the lines underneath are never executed
			print 'Age is not valid, setting age to 0.'
			self.initialAge = 0
		
		if self.initialAge < 13:
			print 'You are young.'
		elif self.initialAge >= 13 and self.initialAge < 18:
			print 'You are a teenager.'
		else:
			print 'You are old.'
    def yearPasses(self):
        # Increment the age of the person in here
		self.initialAge += 1 
		

t = int(raw_input())
for i in range(0, t):
    age = int(raw_input())         
    p = Person(age) #create instance of class  
    p.amIOld() #call method in class
    for j in range(0, 3):
        p.yearPasses() #call method in class        
    p.amIOld() #call method in class 
    print("")