#include <iostream>
#include <string>
#include <sstream>
#include <exception>
using namespace std;

/* Define the exception here */
class BadLengthException {
private: //access modifier
//member variables will go here becasue you don't want them changes
	int n;
public: //access modifier
//Overload constructor - different way to call the same function
	BadLengthException(int errornumber) {
		n = errornumber;
	}

//Accessor Functions - return our member variables
	int what() {
		return n;
	}
};


bool checkUsername(string username) { //function takes on string input
	bool isValid = true; //variable is a bool type and is set to true
	int n = username.length(); //call length method on string variable and assign it to n variable
	if(n < 5) {
		throw BadLengthException(n);
	}
	for (int i = 0; i < n - 1; i++) { //enter loop
		if (username[i] == 'w' && username[i + 1] == 'w') { //if first index eqauls w and the next index equals w, then execute line below
			isValid = false; //variable is now false
		}
	}
	return isValid; //return variable
}

int main() {
	int T; //define int variable
	cin >> T; //take input from 
	while (T--) { //enter loop until 
		string username; //define variable as a string
		cin >> username; //take input from keyboard
		try { //A try block identifies a block of code for which particular exceptions will be activated. It's followed by one or more catch blocks
			bool isValid = checkUsername(username); // checkUsername(username) return a true or false. it is assigned to a variable called isValid
			if (isValid) {
				cout << "Valid" << '\n';
			}
			else {
				cout << "Invalid" << '\n';
			}
		}
		// A program catches an exception with an exception handler at the place in a program where you want to handle the problem. 
		//The catch keyword indicates the catching of an exception.
		catch (BadLengthException e) { //if you can't call checkUsername(username), you catch the error here. e is a string
			cout << "Too short: " << e.what() << '\n';
		}
	}
	return 0;
}