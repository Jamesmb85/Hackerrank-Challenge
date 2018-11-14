An OrderedDict is a dictionary that remembers the order of the keys that were inserted first. If a new entry overwrites an existing entry, the original insertion position is left unchanged.

Example

Code

>>> from collections import OrderedDict
>>> 
>>> ordinary_dictionary = {}
>>> ordinary_dictionary['a'] = 1
>>> ordinary_dictionary['b'] = 2
>>> ordinary_dictionary['c'] = 3
>>> ordinary_dictionary['d'] = 4
>>> ordinary_dictionary['e'] = 5
>>> 
>>> print ordinary_dictionary
{'a': 1, 'c': 3, 'b': 2, 'e': 5, 'd': 4}
>>> 
>>> ordered_dictionary = OrderedDict()
>>> ordered_dictionary['a'] = 1
>>> ordered_dictionary['b'] = 2
>>> ordered_dictionary['c'] = 3
>>> ordered_dictionary['d'] = 4
>>> ordered_dictionary['e'] = 5
>>> 
>>> print ordered_dictionary
OrderedDict([('a', 1), ('b', 2), ('c', 3), ('d', 4), ('e', 5)])

Task

You are the manager of a supermarket.
You have a list of N items together with their prices that consumers bought on a particular day.
Your task is to print each item_name and net_price in order of its first occurrence.

item_name = Name of the item.
net_price = Quantity of the item sold multiplied by the price of each item.

Input Format

The first line contains the number of items, N.
The next N lines contains the item's name and price, separated by a space.

Constraints

Output Format

Print the item_name and net_price in order of its first occurrence.

Sample Input

9
BANANA FRIES 12
POTATO CHIPS 30
APPLE JUICE 10
CANDY 5
APPLE JUICE 10
CANDY 5
CANDY 5
CANDY 5
POTATO CHIPS 30

Sample Output

BANANA FRIES 12
POTATO CHIPS 60
APPLE JUICE 20
CANDY 20

Explanation

BANANA FRIES: Quantity bought:1, Price:12 Net Price:12
POTATO CHIPS: Quantity bought:2 , Price:30 Net Price:60
APPLE JUICE: Quantity bought:2 , Price:10 Net Price:20
CANDY: Quantity bought:4 , Price:5 Net Price:20 


#Note: I did not handle the input like the problem describe. I first enter the price and then items
#The end result is the same. Some people used the rpartition method and others use the rsplit
from collections import OrderedDict
number_of_items = int(input("Enter the number of items: \n"))
#create ordered dict
workingdict = OrderedDict()
#fill in dictionary
for value in range(0, number_of_items):
    #generate key and update its value with the Price of the item
    print("Enter the price: ")
    netPrice = int(input())
    print("Enter the item: ")
    item = input()


    #if key exist, we need to get the value and increase it by netprice and then update the value
    try:
        #we try to increase the price for a key. If it doesn't exist we throw an exception and then we will add it
        if(workingdict[item]):
            workingdict[item] += netPrice
    except KeyError:
        #key doesn't exist so we are adding it for the first time and it's netPrice
        workingdict[item] = netPrice


for key, value in workingdict.items():
    print("{} {}".format(key, value))
