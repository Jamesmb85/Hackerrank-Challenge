n = int(raw_input('Please enter the number of phone book entries: '))

#need to create an iterable for dictionary. Will use the split method to create a list.
#will alternate between key and value
#need to create this using a while loop

i = 0 #counter for while loop

values = [] #values associated with keys will be append to this list

keys = [] #the keys for the dictionary

phonebook = {} #empty dictionary

while i < n: #loop will execute until you reach the number of phone book entries
	g = raw_input('Please input the key and value:  ')
	x, y = g.split(' ') #string above it split. '' is the delimeter. Results are unpacked into variables on the left
	keys.append(x) #strings that are assigned are tp variable above are appened to the end of the list
	values.append(y) #strings that are assigned are tp variable above are appened to the end of the list
	i += 1 #increase counter by 1

phonebook = {key:value for values, keys in zip(keys, values}}
print phonebook