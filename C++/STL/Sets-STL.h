//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
//#include <iostream>, instructs the preprocessor to include a section of standard C++ code, known as header iostream, 
//that allows to perform standard input and output operations
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)

//The function named main is a special function in all C++ programs; it is the function called when the program is run. 
//The execution of all C++ programs begins with the main function, regardless of where the function is actually located within the code.
int main() {

	int queries; //declare a variable called queries as type int

	cin >> queries; //take input from the keyboard

	set<int> numbers; //set only contains unique elements

	//need to iterate through set
	for (int i = 0; i < queries; i++) {

		int integer; //declare a variable called integer as type int
		int input; //declare a variable called input as type int

		cin >> integer; //take input from the keyboard

		switch(integer) {

			case 1: //add element to the set
				cin >> input; //take input from the keyboard
				numbers.insert(input); //Inserts an integer input into the set numbers.
				break;

			case 2: // Delete an element input from the set. (If the number input is not present in the set, then do nothing).
				cin >> input; //take input from the keyboard
				
				//numbers.find() returns an iterator that points to the right value or points at the end of the set
				if (numbers.find(input) != numbers.end()) {
					
					numbers.erase(input); //Erases an integer input from the set numbers.
				}

				break;

			case 3:// If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
				cin >> input; //take input from the keyboard

				//numbers.find(input) returns an iterator that points to the right value or points at the end of the set
				set<int>::iterator itFind = numbers.find(input);

				if (itFind != numbers.end()) {

					cout << "Yes" << endl;

				}
				else {
					
					cout << "No" << endl;

				}

				break;

			}

	}
	

	return 0; //The program was successful
}
