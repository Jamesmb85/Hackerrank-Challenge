//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)


int main() {
    int a; //define a as an int 
	int b; //define b as an int 
	int c; //define c as an int 
	
	//these operation makes the program wait for input from cin; generally, this means that the program will wait for the user to enter some sequence with the keyboard.
	cin >> a; 
	cin >> b;
	cin >> c;
	
	cout << a + b + c; //the sum of 3 integers is output to the screen
    return 0;
}