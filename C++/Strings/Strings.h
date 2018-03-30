#include <iostream>
#include <string> //the string class is included in the header
using namespace std;

int main() {
	
	string a; //variable a is declared as a string
	string b; //variable b is declared as a string
	
	a.size(); //the length of the string a 
	b.size(); //the length of the string b
	
	
	/* the program wait for input from cin; generally, this means that the program will wait for the user to enter some 
	sequence with the keyboard. In this case, note that the characters introduced using the keyboard are only 
	transmitted to the program when the ENTER (or RETURN) key is pressed. Once the statement with the extraction operation 
	on cin is reached, the program will wait for as long as needed until some input is introduced */
	
	cin >> a; //string a is recieved from the standard input stream
	cin >> b; //string b is recieved from the standard input stream
	
	//the size of each string is displayed on the screen with a space in between them. end1 can also be used to break lines
	cout << a.size() << " " << b.size() << endl; 
	
	cout <<  a + b << endl; // print the string produced by concatenating a and b

	
	char first_letter_of_a = a[0]; //first letter of string a is assigned to first_letter_of_a
	char first_letter_of_b = b[0]; //first letter of string b is assigned to first_letter_of_b
	
	a[0] = first_letter_of_b; //first character in string a is now first_letter_of_b
	b[0] = first_letter_of_a; //first character in string b is now first_letter_of_a
	
	//print string a with its first letter now the first letter from string b and string b with it's first letter now 
	//from string a with a space in-between
	cout << a << " " << b << endl; 
	
	
    return 0;
}
