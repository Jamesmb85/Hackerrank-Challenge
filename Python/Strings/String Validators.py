# Python has built-in string validation methods for basic data. It can check if a string is composed of alphabetical characters, alphanumeric characters, digits, etc.

# str.isalnum()
# This method checks if all the characters of a string are alphanumeric (a-z, A-Z and 0-9).

# >>> print 'ab123'.isalnum()
# True
# >>> print 'ab123#'.isalnum()
# False

# str.isalpha()
# This method checks if all the characters of a string are alphabetical (a-z and A-Z).

# >>> print 'abcD'.isalpha()
# True
# >>> print 'abcd1'.isalpha()
# False

# str.isdigit()
# This method checks if all the characters of a string are digits (0-9).

# >>> print '1234'.isdigit()
# True
# >>> print '123edsd'.isdigit()
# False

# str.islower()
# This method checks if all the characters of a string are lowercase characters (a-z).

# >>> print 'abcd123#'.islower()
# True
# >>> print 'Abcd123#'.islower()
# False

# str.isupper()
# This method checks if all the characters of a string are uppercase characters (A-Z).

# >>> print 'ABCD123#'.isupper()
# True
# >>> print 'Abcd123#'.isupper()
# False

# Task

# You are given a string S.
# Your task is to find out if the string S contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase characters.

# Input Format

# A single line containing a string S.

# Constraints
# 0<len(s)<1000

# Output Format

# In the first line, print True if S has any alphanumeric characters. Otherwise, print False.
# In the second line, print True if S has any alphabetical characters. Otherwise, print False.
# In the third line, print True if S has any digits. Otherwise, print False.
# In the fourth line, print True if S has any lowercase characters. Otherwise, print False.
# In the fifth line, print True if S has any uppercase characters. Otherwise, print False. 


#the first set of code is my solution after not being able to pass a few test cases and asking for help
working_string = input()
#let's create a list of values that contain the false values for the methods
results = ["False", "False", "False", "False", "False"]

#let's test each letter
for letter in working_string:
    if(letter.isalnum()):
        #if the result is true, then update the first index on the results list
        #this line only executes if the letter is alphanumeric (a-z, A-Z and 0-9).
        #so after iterating through the string, we should have the first index properly updated
        #this logic applies for all of the other methods as well except they are testing for different conditions
        results[0] = "True"
    if(letter.isalpha()):
        results[1]  = "True"
    if(letter.isdigit()):
        results[2] = "True"
    if(letter.islower()):
        results[3] = "True"
    if(letter.isupper()):
        results[4] = "True"

print(*results, sep="\n")
# Applying * on any iterable object, by placing it to the left of the object, produces the individual elements of the iterable.
# If applied on a list-like iterable, it produces the elements of the list in the order they appear in the list.
# If applied on a dict-like object, it produces the keys of the dict in the order you would get as if you iterated the dict.

#the second set of code is my original solution. Not vert efficent with the amount of loops
#need to iterate through the string and check each character to see if condition applies
#let's start with isalum. We need to check each character until the end to see if condition is true
#if we get to the end of the string and condition isn't true, we return false
for letter in working_string:
    #check letter to see if condition is met
    if(letter.isalnum()):
        print("True")
        break #don't need to check the rest of the letter
    else:
        #check the next letter
        continue
    print("False")
for letter in working_string:
    #check letter to see if condition is met
    if(letter.isalpha()):
        print("True")
        break #don't need to check the rest of the letter
    else:
        #check the next letter
        continue
    print("False")

for letter in working_string:
    #check letter to see if condition is met
    if(letter.isdigit()):
        print("True")
        break #don't need to check the rest of the letter
    else:
        #check the next letter
        continue
    print("False")

for letter in working_string:
    #check letter to see if condition is met
    if(letter.islower()):
        print("True")
        break #don't need to check the rest of the letter
    else:
        #check the next letter
        continue
    print("False")

for letter in working_string:
    #check letter to see if condition is met
    if(letter.isupper()):
        print("True")
        break #don't need to check the rest of the letter
    else:
        #check the next letter
        continue
    print("False")
