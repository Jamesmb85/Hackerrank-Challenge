# Function to print all sub strings
def subString(s, n):
    substringList  = []

    # Pick starting point in outer loop
    # and lengths of different strings for
    # a given starting point
    for i in range(n):
        for len in range(i+1,n+1):
            #place in list
            substringList.append(s[i: len]);

    return substringList


def minion_game(word):
    # Both players are given the same string, word.
    # Both players have to make substrings using the letters of the string word.
    # Stuart has to make words starting with consonants.
    # Kevin has to make words starting with vowels.
    # The game ends when both players have made all possible substrings.

    #let's create a list of vowels
    vowels = 'AEIOU'

    #create the player's score
    kevin_score = 0
    stuart_score = 0

    #list of substrings
    substring_list = []

    #We need to take substrings from the input and count how many times it appears in the rest of the string
    #For the word Banana, we need to get the following substrings:
        #Those starting with a consonant
        #B, N, BA, NA, BAN, NAN, BANA, NANA, BANAN, BANANA
        #Those starting with a vowel
        #A, AN, ANA, ANAN, ANANA

    #call the substring method
    value = subString(word, len(word))


    #iterate through the list of substring and see which one starts with a vowel and which dont
    #We are just checking the first letter of each substring
    for index in value:
        if index[0][0] in vowels:
            kevin_score += 1
        else:
            stuart_score += 1

    if(stuart_score > kevin_score):
        print("Using the word %s, stuart score is %d and kevin score is %d" %(word, stuart_score, kevin_score))
    elif(kevin_score > stuart_score):
        print("Using the word %s, kevin score is %d and stuart score is %d" %(word, kevin_score, stuart_score))
    else:
        print("Draw")



word = input('Enter the word we are playing with: ')
#call the function
minion_game(word)