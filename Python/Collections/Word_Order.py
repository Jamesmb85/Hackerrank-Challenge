""" 
You are given n words. Some words may repeat. For each word, output its number of occurrences. 
The output order should correspond with the input order of appearance of the word. 
See the sample input/output for clarification.

Note: Each input line ends with a "\n" character.

Constraints:
1 <= n <= 10**5

The sum of the lengths of all the words do not exceed
10**6

All the words are composed of lowercase English letters only.

Input Format

The first line contains the integer, n.
The next n lines each contain a word.

Output Format

Output 2 lines.
On the first line, output the number of distinct words from the input.
On the second line, output the number of occurrences for each distinct word according to their appearance in the input.

Sample Input

4
bcdef
abcdefg
bcde
bcdef

Sample Output

3
2 1 1

Explanation

There are 3 distinct words. Here, "bcdef" appears twice in the input at the first and last positions. 
The other words appear once each. 
The order of the first appearances are "bcdef", "abcdefg" and "bcde" which corresponds to the output.

"""

#import Collections module
from collections import OrderedDict

#for this problem we need a key-value pair of a number and the input string
number_of_words = int(input("Enter the number of words: "))

ordered_dictionary = OrderedDict()

for _ in range(number_of_words):
    #read the words in and place in the ordered_dictionary
    key = input()
    #check to see if key already exists
    if key not in ordered_dictionary.keys():
        #add key value pair. We have the string and the number 1 since it did not appear in the OrderedDict
        ordered_dictionary.update({key:1})
        continue
    #if the key already exist, increase it's counter by 1
    ordered_dictionary[key] += 1

#print out the number of unique keys
print(len(ordered_dictionary.keys()))
#print out the values of the dictionary. The values method returns a list so we use the * operator to unpack it
print(*ordered_dictionary.values())