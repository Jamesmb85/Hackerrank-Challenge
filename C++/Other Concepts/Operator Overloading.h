//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
//#include <iostream>, instructs the preprocessor to include a section of standard C++ code, known as header iostream, 
//that allows to perform standard input and output operations
#include<iostream>
#include<cstdio>
#include<vector>
#include<iostream>
#include<algorithm>
#include<string>

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)
class Matrix {

public: //access modifier
	vector< vector<int> > a;

	//overload +
	Matrix & operator + (const Matrix &y) {

		for (int m = 0; m < y.a.size(); ++m) {
			for (int n = 0; n < y.a[0].size(); ++n) {
				this->a[m][n] = this->a[m][n] + y.a[m][n];
			}
		}

		return *this;

	}


};


//The function named main is a special function in all C++ programs; it is the function called when the program is run. 
//The execution of all C++ programs begins with the main function, regardless of where the function is actually located within the code.

//main() function  takes a set of inputs to create two matrices and prints the result of their addition.
int main() {

	int cases; //declare a variable cases as an int
	int k; //declare a variable k as an int
	cin >> cases; //take input from the keyboard
	for (k = 0; k<cases; k++) {
		Matrix x; //creates an instance of the class Matrix
		Matrix y; //creates an instance of the class Matrix
		Matrix result; //creates an instance of the class Matrix
		int n; //declare a variable n as an int
		int m; //declare a variable m as an int. This is the number of rows
		int i; //declare a variable i as an int. This is the number of columns
		int j; //declare a variable j as an int
		cin >> n; //take input from the keyboard
		cin >> m; //take input from the keyboard
		for (i = 0; i<n; i++) {
			vector<int> b; //create a vector called b of type int
			int num; //declare a variable num as an int
			for (j = 0; j<m; j++) {
				cin >> num; //take input from the keyboard
				b.push_back(num); //call push_back method to place num in the vector
			}
			x.a.push_back(b); //call push_back method to place vector(b), that was filled in above, in vector a, that was created from the Matrix class. That vector is place in the Matrix instance, x 
		}
		for (i = 0; i<n; i++) {
			vector<int> b;//create a vector called b of type int
			int num; //declare a variable num as an int
			for (j = 0; j<m; j++) {
				cin >> num; //take input from the keyboard
				b.push_back(num); //call push_back method to place num in the vector
			}
			y.a.push_back(b); //call push_back method to place vector(b), that was filled in above, in vector a, that was created from the Matrix class. That vector is place in the Matrix instance, y
		}
		result = x + y; //call Matrix & operator + (const Matrix &y) since + is overload

		//nested loop below prints outs the rows and columns of the Matrix
		for (i = 0; i<n; i++) {
			for (j = 0; j<m; j++) {
				cout << result.a[i][j] << " "; //result instance calls a(vector) from Matrix class 
			}
			cout << endl;
		}
	}

	return 0; //The program was successful
}