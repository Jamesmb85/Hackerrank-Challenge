# Calendar Module

# The calendar module allows you to output calendars and provides additional useful functions for them.

# class calendar.TextCalendar([firstweekday])

# This class can be used to generate plain text calendars.

# Sample Code

# >>> import calendar
# >>> 
# >>> print calendar.TextCalendar(firstweekday=6).formatyear(2015)
                                  # 2015

      # January                   February                   March
# Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa
             # 1  2  3       1  2  3  4  5  6  7       1  2  3  4  5  6  7
 # 4  5  6  7  8  9 10       8  9 10 11 12 13 14       8  9 10 11 12 13 14
# 11 12 13 14 15 16 17      15 16 17 18 19 20 21      15 16 17 18 19 20 21
# 18 19 20 21 22 23 24      22 23 24 25 26 27 28      22 23 24 25 26 27 28
# 25 26 27 28 29 30 31                                29 30 31

       # April                      May                       June
# Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa
          # 1  2  3  4                      1  2          1  2  3  4  5  6
 # 5  6  7  8  9 10 11       3  4  5  6  7  8  9       7  8  9 10 11 12 13
# 12 13 14 15 16 17 18      10 11 12 13 14 15 16      14 15 16 17 18 19 20
# 19 20 21 22 23 24 25      17 18 19 20 21 22 23      21 22 23 24 25 26 27
# 26 27 28 29 30            24 25 26 27 28 29 30      28 29 30
                          # 31

        # July                     August                  September
# Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa
          # 1  2  3  4                         1             1  2  3  4  5
 # 5  6  7  8  9 10 11       2  3  4  5  6  7  8       6  7  8  9 10 11 12
# 12 13 14 15 16 17 18       9 10 11 12 13 14 15      13 14 15 16 17 18 19
# 19 20 21 22 23 24 25      16 17 18 19 20 21 22      20 21 22 23 24 25 26
# 26 27 28 29 30 31         23 24 25 26 27 28 29      27 28 29 30
                          # 30 31

      # October                   November                  December
# Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa      Su Mo Tu We Th Fr Sa
             # 1  2  3       1  2  3  4  5  6  7             1  2  3  4  5
 # 4  5  6  7  8  9 10       8  9 10 11 12 13 14       6  7  8  9 10 11 12
# 11 12 13 14 15 16 17      15 16 17 18 19 20 21      13 14 15 16 17 18 19
# 18 19 20 21 22 23 24      22 23 24 25 26 27 28      20 21 22 23 24 25 26
# 25 26 27 28 29 30 31      29 30                     27 28 29 30 31


# Task

# You are given a date. Your task is to find what the day is on that date.

# Input Format

# A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

# Constraints
# 2000 < year < 3000

# Output Format

# Output the correct day in capital letters.

# Sample Input

# 08 05 2015

# Sample Output

# WEDNESDAY

# Explanation

# The day on August 5th was WEDNESDAY.

#Python 3 Solution
#import module
import calendar

#tuple unpacking. Split returns a list of strings and those are unpacked by position to the corresponding variables at the same position
#use the map function to cast the strings as int
month, day, year = map(int, input().split())

#create a dictionary of Days(values) and Numbers
days = {0:'MONDAY',1:'TUESDAY',2:'WEDNESDAY',3:'THURSDAY',4:'FRIDAY',5:'SATURDAY',6:'SUNDAY'}

#Weekday Function returns the week day number(0 is Monday) of the date specified in its arguments
#So, the int retruns is mapped to a day in the days dictionary
print(days[calendar.weekday(year, month, day)])


"""#Python 2 Solution
import calendar

#use the map function to map the int function to the values in input string that are separated by a space
#unpack the values from input to the variables
month, day, year = map(int, input().split()) 
#calendar.day_name An array that represents the days of the week in the current locale.
#calendar.weekday(year, month, day) Returns the day of the week (0 is Monday) for year (1970–…), month (1–12), day (1–31).
print(calendar.day_name[calendar.weekday(year, month, day)].upper())

"""
