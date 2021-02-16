def merge_the_tools(string, k):
    # your code goes here
    string_without_spaces = string.strip() #remove the leading and trailing spaces

    #empty string
    empty_string = ""

    #seocnd empty string
    newEmpty_string = ""

    #working list
    substring_list = []


    #find all of the substrings of size k
    for letters in string_without_spaces:
        empty_string += letters
        if(len(empty_string) == k):
            #let's sort the string before adding to the list
            sorted_string = "".join(empty_string)
            substring_list.append(sorted_string) #add substrings to list
            empty_string = '' #reset the string
        else:
            continue


    #need to look at each substring and remove duplicate letters if they exist
    for substring in substring_list:
        #need to look at each letter in each substring
        for letter in substring:
           #we will check to see if letter is attached to the string.
           #if it is, then go to the next letter, if it isn't then concatenate to string
            if letter not in newEmpty_string:
               newEmpty_string += letter

        print(newEmpty_string)
        newEmpty_string = '' #reset the string


#AABCAAADA
string = input("Enter the string of letters we want to analyze. No spaces: ")
k = int(input("Enter the size of the substring: "))
merge_the_tools(string, k)