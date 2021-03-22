# An OrderedDict is a dictionary that remembers the order of the keys that were inserted first. If a new entry overwrites an existing entry, the original insertion position is left unchanged.

# Example

# Code

# >>> from collections import OrderedDict
# >>> 
# >>> ordinary_dictionary = {}
# >>> ordinary_dictionary['a'] = 1
# >>> ordinary_dictionary['b'] = 2
# >>> ordinary_dictionary['c'] = 3
# >>> ordinary_dictionary['d'] = 4
# >>> ordinary_dictionary['e'] = 5
# >>> 
# >>> print ordinary_dictionary
# {'a': 1, 'c': 3, 'b': 2, 'e': 5, 'd': 4}
# >>> 
# >>> ordered_dictionary = OrderedDict()
# >>> ordered_dictionary['a'] = 1
# >>> ordered_dictionary['b'] = 2
# >>> ordered_dictionary['c'] = 3
# >>> ordered_dictionary['d'] = 4
# >>> ordered_dictionary['e'] = 5
# >>> 
# >>> print ordered_dictionary
# OrderedDict([('a', 1), ('b', 2), ('c', 3), ('d', 4), ('e', 5)])

# Task

# You are the manager of a supermarket.
# You have a list of N items together with their prices that consumers bought on a particular day.
# Your task is to print each item_name and net_price in order of its first occurrence.

# item_name = Name of the item.
# net_price = Quantity of the item sold multiplied by the price of each item.

# Input Format

# The first line contains the number of items, N.
# The next N lines contains the item's name and price, separated by a space.

# Constraints

# Output Format

# Print the item_name and net_price in order of its first occurrence.

# Sample Input

# 9
# BANANA FRIES 12
# POTATO CHIPS 30
# APPLE JUICE 10
# CANDY 5
# APPLE JUICE 10
# CANDY 5
# CANDY 5
# CANDY 5
# POTATO CHIPS 30

# Sample Output

# BANANA FRIES 12
# POTATO CHIPS 60
# APPLE JUICE 20
# CANDY 20

# Explanation

# BANANA FRIES: Quantity bought:1, Price:12 Net Price:12
# POTATO CHIPS: Quantity bought:2 , Price:30 Net Price:60
# APPLE JUICE: Quantity bought:2 , Price:10 Net Price:20
# CANDY: Quantity bought:4 , Price:5 Net Price:20 


#import Collections module
from collections import OrderedDict


number_of_grocery_items = int(input('Enter the number of grocery items you are buying: '))
#since we are have a key = food name and value = price we need a dictionary
#but since the order of the keys matter we need an ordered dictionary
grocery_items = OrderedDict()

for _ in range(number_of_grocery_items):
    """
    let's fill in the ordered dictionary. We are not removing/deleting keys, but the values will be updated if the key is repeated
    we need to split the string using a regular expression because something like BANANA FRIES 12 need to be split using a space followed by a number
    The rpartition() method searches for the last occurrence of a specified string, and splits the string into a tuple containing three elements.
    The first element contains the part before the specified string.
    The second element contains the specified string.
    The third element contains the part after the string.
    """
    food_name, space, cost = input().rpartition(" ")
    #need to check if key already exist, if it does, take the corresponding value and add to it and update it
    if food_name in grocery_items:
        #update the cost
        #cast the cost as an int and add it to the current food_name value
        grocery_items[food_name] = int(cost) + grocery_items.get(food_name)
    else:
        #the key doesn't exist so we add it and the cost
        grocery_items[food_name] = int(cost)

#print out keys and values
for keys, values in grocery_items.items():
    print(f'{keys} {values}')


