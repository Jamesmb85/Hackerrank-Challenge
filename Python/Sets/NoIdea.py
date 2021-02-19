happiness = 0
array_size, set_size = map(int, input("Enter the size of the Array and Set. Enter the integers separated by a space: ").split())
arrayelments = input("Enter the integers that are in the array. Separated by a space: ").split()
firstset  = input("Enter the integers in the first set. Separated by a space: ").split()
secondset  = input("Enter the integers in the first set. Separated by a space: ").split()

#convert input into sets
firstset = set(firstset)
secondset = set(secondset)

#we increase our happiness by 1 for all elements in the first set
#if those same eleemnts are in the second set we decrease our happiness
#if the element only exist in the second set, we do nothing
for value in arrayelments:
    if value in firstset:
        happiness += 1
    if value in secondset:
        happiness -= 1


print(happiness)




