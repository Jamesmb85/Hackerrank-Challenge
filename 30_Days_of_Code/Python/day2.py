# Objective 
 # In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video! 

# Task 
 # Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 

# Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!


# Input Format
# There are  lines of numeric input: 
 # The first line has a double,  (the cost of the meal before tax and tip). 
 # The second line has an integer,  (the percentage of  being added as tip). 
 # The third line has an integer,  (the percentage of  being added as tax).

# Output Format

# Print The total meal cost is totalCost dollars., where  is the rounded integer result of the entire bill ( with added tax and tip).


# Sample Input
# 12.00
# 20
# 8


# Sample Output
# The total meal cost is 15 dollars.

# We round  to the nearest dollar (integer) and then print our result:
# The total meal cost is 15 dollars.

####################################################################################################################
##############################################Solution##############################################################
##############################################Solution##############################################################
##############################################Solution##############################################################
def get_total_cost_of_meal():
    # original meal price
    meal_cost = float(raw_input())
    # tip percentage
    tip_percent = int(raw_input())
    # tax percentage
    tax_percent = int(raw_input())

    # Write your calculation code here
    # calculate tip
    tip = (meal_cost * tip_percent) / 100
    # caclulate tax
    tax = (meal_cost * tax_percent) / 100

    # cast the result of the rounding operation to an int and save it as total_cost 
    total_cost = int(round(meal_cost + tip + tax))
    
    return str(total_cost)

# Print your result
print("The total meal cost is " + get_total_cost_of_meal() + " dollars.")