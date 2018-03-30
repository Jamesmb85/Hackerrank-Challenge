//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
//#include <iostream>, instructs the preprocessor to include a section of standard C++ code, known as header iostream, 
//that allows to perform standard input and output operations
#include<iostream>
#include<string>

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)

//The function named main is a special function in all C++ programs; it is the function called when the program is run. 
//The execution of all C++ programs begins with the main function, regardless of where the function is actually located within the code.


//Operator Overloading

#include<iostream>

using namespace std;

class Complex
{
public:
	int a, b;
	void input(string s)
	{
		int v1 = 0;
		int i = 0;
		while (s[i] != '+')
		{
			v1 = v1 * 10 + s[i] - '0';
			i++;
		}
		while (s[i] == ' ' || s[i] == '+' || s[i] == 'i')
		{
			i++;
		}
		int v2 = 0;
		while (i<s.length())
		{
			v2 = v2 * 10 + s[i] - '0';
			i++;
		}
		a = v1;
		b = v2;
	}
};

//Overload operators + and << for the class complex
//+ should add two complex numbers as (a+ib) + (c+id) = (a+c) + i(b+d)
//<< should print a complex number in the format "a+ib"
Complex operator+(const Complex & X, const Complex & Y) {
	Complex Z{ X.a + Y.a, X.b + Y.b };
	return Z;
}

ostream &operator<<(ostream &Q, const Complex &P) {

	Q << P.a << "+" << "i" << P.b << endl;
	return Q;
}


int main(){
	
	Complex x; //creates an instance of the class Complex
	Complex y; //creates an instance of the class Complex
	
	string s1; //declare a string s1
	string s2; //declare a string s2
	
	cin >> s1; //take input from the keyboard
	cin >> s2; //take input from the keyboard
	
	x.input(s1); //call method in Complex class
	y.input(s2); //call method in Complex class

	Complex z = x + y; //calls Complex operator+(const Complex & X, const Complex & Y)
	
	cout << z << endl; //calls ostream &operator<<(ostream &Q, const Complex &P)
					   //cout has left right associativity . Meaning cout << z is processed first and then z << endl is processed
					   //cout << z returns an object which is a reference to ofstream	
	
	return 0; //The program was successful