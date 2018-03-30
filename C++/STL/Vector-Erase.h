#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
	
	vector<int> MyNewVector; //create a vector of type int called MyNewVector
	
	int input; //declare variable input as an int
	int size; //declare variable size as an int
	int remove; //declare variable remove as an int
	int begining; //declare variable begining as an int
	int end; //declare variable end as an int
    cin >> size; //take size in from keyboard and assign it to variable
	
	
	for(unsigned int i  = 0; i < size; i++){ //this loop creates the vector
        
        cin >> input; //take input in from keyboard and assign it to variable
		MyNewVector.push_back(input); //input from cin is added to the vector. 
        
    }
	
	
	//below is the line to remove an element from MyNewVector
	cin >> remove; //take remove in from keyboard and assign it to variable 	
	MyNewVector.erase(MyNewVector.begin() + remove -1); 
	//MyNewVector will have the element at position remove -1 taken out of the vector since begin() starts at position 1.
	//So remove = 1, will remove the element at position 0, which is the first element.
	
	//below is the line to remove elements in a given range
	cin >> begining;
	cin >> end;
	MyNewVector.erase(MyNewVector.begin()+ begining - 1, MyNewVector.begin()+ end -1);
	//Removes the elements in the range from start to end inclusive of the start and exclusive of the end.
	//So, begining - 1 and end -1 move to the left for each side of the range.
	
	
	
	
	cout << MyNewVector.size() << endl; //prints out the size after the two erase statements above
	
	
	//prints out the vector after an element was remove and a range was removed
	for(unsigned int j  = 0; j < MyNewVector.size(); j++){ //this loop prints the vector. j < MyNewVector.size() is used since the size of the vector has changed
        
        cout << MyNewVector[j] << " "; //values of vectors are printed with a space in-between
    }
    return 0;
}
