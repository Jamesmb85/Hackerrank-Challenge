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
    cin >> size; //take size in from keyboard and assign it to variable
	
    
    for(unsigned int i  = 0; i < size; i++){ //this loop creates the vector
        
        cin >> input; //take input from keyboard
		MyNewVector.push_back(input); //input from cin is added to the vector. 
        
    }
    
    sort(MyNewVector.begin(),MyNewVector.end()); //MyNewVector is sorted in ascended order
    
    
    for(unsigned int j  = 0; j < size; j++){ //this loop prints the vector
        
        cout << MyNewVector[j] << " "; //values of vectors are printed with a space in-between
    }
    
    return 0;
}

