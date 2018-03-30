//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
//#include <iostream>, instructs the preprocessor to include a section of standard C++ code, known as header iostream, 
//that allows to perform standard input and output operations
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
#include <string>

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)

//The function named main is a special function in all C++ programs; it is the function called when the program is run. 
//The execution of all C++ programs begins with the main function, regardless of where the function is actually located within the code.



/*Write the class AddElements here*/
template<class A>
class AddElements {

	A value1; //data member function of Type A

public: //access modifier
		//Constructor
	AddElements(A value2) {

		value1 = value2;

	}

	A add(A value3) {
		return value1 + value3;
	}

};

// class template specialization:
template <>
class AddElements <string> {

	string value4; //data member function of Type string

public:
	//Constructor
	AddElements(string value5) {
		value4 = value5;
	}

	string concatenate(string value6) {
		return value4 + value6;
	}

};



int main() {
	//Class Template Explanation
	//A class template has a parameter, which is called A in your example.When the compiler sees code like

	//AddElements<int> aei;

	//It generates some code which defines a class which is the exactly same as AddElements but with A replaced by int. 
	//(This is knownn as template instantiation).It then creates an object of this class and carries on as normal.

	//
	//A template specialization is when you want the generated class to behave differently for some parameters; 
	//for example, builtin types have different characteristics from user - defined objects.This code specializes the std::string version to add another method called concatenate.

	//To try it out, you can use a main function like this.

	// Use generic templace
	AddElements<int> ae2(5);
	cout << ae2.add(6) << endl;

	// Use string specialization
	AddElements<string> ae("what ");
	cout << ae.concatenate("is this?") << endl;

	//Hackerank Solution
	int n, i; //declare two int variables
	cin >> n; //take input from keyboard 
	for (i = 0; i<n; i++) {
		string type; //declare a string called type
		cin >> type; //take input from keyboard 
		if (type == "float") {
			double element1, element2; //declare two double variables
			cin >> element1 >> element2; //take input from keyboard 
										 //create an instance of class AddElements. calls the default constructor. 
										 //<double> defines the type of object we are going to work with
			AddElements<double> myfloat(element1);
			cout << myfloat.add(element2) << endl; //call method from class
		}
		else if (type == "int") {
			int element1, element2; //declare two int variables
			cin >> element1 >> element2; //take input from keyboard
										 //create an instance of class AddElements. calls the default constructor. 
										 //<int> defines the type of object we are going to work with
			AddElements<int> myint(element1);
			cout << myint.add(element2) << endl; //call method from class
		}
		else if (type == "string") {
			string element1, element2; //declare two string variables
			cin >> element1 >> element2; //take input from keyboard
										 //create an instance of class AddElements. calls the default constructor. 
										 //<string> defines the type of object we are going to work with
			AddElements<string> mystring(element1);
			cout << mystring.concatenate(element2) << endl; //call method from class
		}
	}
	return 0; //The program was successful
}

