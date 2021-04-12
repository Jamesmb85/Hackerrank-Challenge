# A valid email address meets the following criteria:

# It's composed of a username, domain name, and extension assembled in this format: username@domain.extension

# The username starts with an English alphabetical character, and any subsequent characters consist of one or more of the following: alphanumeric characters, -,., and _.

# The domain and extension contain only English alphabetical characters.

# The extension is 1, 2, or 3 characters in length.

# Given n pairs of names and email addresses as input, print each name and email address pair
# having a valid email address on a new line.

# Hint: Try using Email.utils() to complete this challenge. For example, this code:

# import email.utils
# print email.utils.parseaddr('DOSHI <DOSHI@hackerrank.com>')
# print email.utils.formataddr(('DOSHI', 'DOSHI@hackerrank.com'))

# produces this output:

# ('DOSHI', 'DOSHI@hackerrank.com')
# DOSHI <DOSHI@hackerrank.com>

# Input Format

# The first line contains a single integer, n, denoting the number of email address.
# Each line i of the n subsequent lines contains a name and an email address as two space-separated values following this format:

# name <user@email.com>

# Constraints
# 0<N<100

# Output Format

# Print the space-separated name and email address pairs containing valid email addresses only. Each pair must be printed on a new line in the following format:

# name <user@email.com>

# You must print each valid email address in the same order as it was received as input.

# Sample Input

# 2
# DEXTER <dexter@hotmail.com>
# VIRUS <virus!@variable.:p>

# Sample Output

# DEXTER <dexter@hotmail.com>

# Explanation

# dexter@hotmail.com is a valid email address, so we print the name and email address pair received as input on a new line.
# virus!@variable.:p is not a valid email address because the username contains an exclamation point (!) and the extension contains a colon (:). As this email is not valid, we print nothing.

"""
the r means a raw string
This suppresses the escaping at the interpreter level. The string '\\' gets passed unchanged to the regex parser,
which again sees one escaped backslash as desired.
It’s good practice to use a raw string to specify a regex in Python whenever it contains backslashes.

re.match() function of re in Python will search the regular expression pattern and return the first occurrence.
The Python RegEx Match method checks for a match only at the beginning of the string.
So, if a match is found in the first line, it returns the match object. But if a match is found in some other line,
the Python RegEx Match function returns null.

Here is what is happening during with the string 9587456281 and 1252478965 using the regex below:

r'\A<[A-Za-z](\w|-|\.|_)+@[A-Za-z]+\.[A-Za-z]{1,3}>\Z'

1. \A<[A-Za-z](\w|-|\.|_)+ processes the username
    - \A is an anchor tag and means this need to occur at the beginning of the string
    - So, the username must begin with a <
    -  [A-Za-z] is  any lowercase or upercase letter
    - (\w|-|\.|_) is a group of alphanumeric characters or a dash(-) or a period(\.) or an underscore(_) The or is a bar(|)
    - The + means Matches one or more repetitions of the preceding regex.
    -\. escpaes the special character .  A metacharacter preceded by a backslash loses its special meaning and matches the literal character instead.

2. [A-Za-z]+\. processes the email portion
    - The email contains multiple letters followed by a period

3. [A-Za-z]{1,3}>\Z handle the rest of the string
    - The rest of the string contains anywhere from 1 to 3 letters and the \Z anchor means it must come at the end of the string
"""

import re

regex_string = r'\A<[A-Za-z](\w|-|\.|_)+@[A-Za-z]+\.[A-Za-z]{1,3}>\Z'

number_of_names_and_emails = int(input('Enter the number of names and email addresses you are working with: '))
for _ in range(number_of_names_and_emails):
    print('Enter the name and email address in the following format: name user@email.com: ')
    name, email_address = input().split()

    #check email since that is more unique that a name
    email_to_check = re.match(regex_string, email_address)

    if(email_to_check):
        #print the variables
        print(name,email_address)
    else:
        print('Email does not match')


