"""CSS colors are defined using a hexadecimal (HEX) notation for the combination of Red, Green, and Blue color values (RGB).

Specifications of HEX Color Code

■ It must start with a '#' symbol.
■ It can have 3 or 6 digits.
■ Each digit is in the range of 0 to .F (1,2,3,4,5,6,7,8,9,0,A,B,C,D,E and F).
■ A-F letters can be lower case. (a,b,c,d,e and f are also valid digits).

Examples

Valid Hex Color Codes
#FFF 
#025 
#F0A1FB 

Invalid Hex Color Codes
#fffabg
#abcf
#12365erff

You are  N lines of CSS code. Your task is to print all valid Hex Color Codes, in order of their occurrence from top to bottom.

CSS Code Pattern

Selector
{
	Property: Value;
}

Input Format

The first line contains N, the number of code lines.
The next N lines contains CSS Codes.

Constraints
0<N<50

Output Format

Output the color codes with '#' symbols on separate lines.

Sample Input

11
#BED
{
    color: #FfFdF8; background-color:#aef;
    font-size: 123px;
    background: -webkit-linear-gradient(top, #f9f9f9, #fff);
}
#Cab
{
    background-color: #ABC;
    border: 2px dashed #fff;
}   

Sample Output

#FfFdF8
#aef
#f9f9f9
#fff
#ABC
#fff

Explanation

#BED and #Cab satisfy the Hex Color Code criteria, but they are used as selectors and not as color codes in the given CSS.

Hence, the valid color codes are:

#FfFdF8
#aef
#f9f9f9
#fff
#ABC
#fff

Note: There are no comments ( // or /* */) in CSS Code. """

#this is my working copy. The output for the input above is:
#FfFdF8
#f9f9f9

#the output should be:
#FfFdF8
#aef
#f9f9f9
#fff
#ABC
#fff
lines_of_text = int(input("Enter the number of lines to be scanned: "))
for values in range(lines_of_text):
    css = input()
    match = re.findall(r"(#[0-9,A-F,a-f]{3} | #[0-9,A-F,a-f]{6})", css)
	# findall() searches for the Regular Expression and return a list upon finding 
	#[0-9,A-F,a-f]{3} | #[0-9,A-F,a-f]{6}) is broken down like this:
	#[0-9,A-F,a-f]{3} means any number between 0-9 or upper or locase letter from a-f or A-F. These combine for a size of 3 digits
	# [0-9,A-F,a-f]{6} is the same but size 6. 
	# the | means or so its a group of 3 or 6 digits. 
    if match:
        print(*match, sep="\n")