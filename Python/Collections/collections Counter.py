# A counter is a container that stores elements as dictionary keys, and their counts are stored as dictionary values.

# Sample Code

# >>> from collections import Counter
# >>> 
# >>> myList = [1,1,2,3,4,5,3,2,3,4,2,1,2,3]
# >>> print Counter(myList)
# Counter({2: 4, 3: 4, 1: 3, 4: 2, 5: 1})
# >>>
# >>> print Counter(myList).items()
# [(1, 3), (2, 4), (3, 4), (4, 2), (5, 1)]
# >>> 
# >>> print Counter(myList).keys()
# [1, 2, 3, 4, 5]
# >>> 
# >>> print Counter(myList).values()
# [3, 4, 4, 2, 1]

# Task

# Bill is a shoe shop owner. His shop has X number of shoes.
# He has a list containing the size of each shoe he has in his shop.
# There are N number of customers who are willing to pay x amount of money only if they get the shoe of their desired size.

# Your task is to compute how much money Bill earned.

# Input Format

# The first line contains X, the number of shoes.
# The second line contains the space separated list of all the shoe sizes in the shop.
# The third line contains Y, the number of customers.
# The next Z lines contain the space separated values of the shoe size desired by the customer and xi, the price of the shoe.

# Constraints
# 0<X<10**3
# 0<Y<=10**3
# 20< xi < 100
# 2 < shoeSize < 20

# Output Format

# Print the amount of money earned by Bill.

# Sample Input

# 10
# 2 3 4 5 6 8 7 6 5 18
# 6
# 6 55
# 6 45
# 6 55
# 4 40
# 18 60
# 10 50

# Sample Output

# 200

# Explanation

# Customer 1: Purchased size 6 shoe for $55.
# Customer 2: Purchased size 6 shoe for $45.
# Customer 3: Size 6 no longer available, so no purchase.
# Customer 4: Purchased size 4 shoe for $40.
# Customer 5: Purchased size 18 shoe for $60.
# Customer 6: Size 10 not available, so no purchase.

# Total money earned = 55 + 45 + 40 + 60 = $200



number_of_shoes = int(input("Enter the number of shoes in the shop: \n"))
shoes_sizes = map(int, input().split())
number_of_customers = int(input("Enter the number of customers: \n"))
money_earned = 0

#call the Counter method so we get the amount the sizes and amount of each size
totalshoes = Counter(shoes_sizes)

for value in range(0, number_of_customers):
    #need to input the customer request for the shoe size and dollar amount
    #we are doing tuple unpacking here. First number is the shoeSize and the second in the price. We wii use the map function and the split function
    shoeSize, price = map(int, input().split())

    #check to see if shoeSize is in totalShoes
    #n Python 0 == False, so if totalshoes[shoeSize] is 0 this will evaluate to False otherwise it will be True.
    if(totalshoes[shoeSize]):
        #shoeSize exist so we increase money_earned by the value of the shoeSize key(price)
        money_earned += price
        #decrement the amount of pairs for that shoeSize by 1
        totalshoes[shoeSize] -= 1

print(money_earned)