#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
	
	int rows_of_data;
	int pieces_of_data_pulled;
	int size;
	int input_value;
	int row_number;
	int col_number;
	
	cin >> rows_of_data;
	cin >> pieces_of_data_pulled;
	
	vector < vector <int> > challenge; //create multi-dimensional vector
	
	//fill out the multi-dimensional vector
	for(int i = 0; i < rows_of_data; i++){
		cin >> size;
		vector<int> MyNewVector; //create a vector of type int called MyNewVector
		for(int j = 0; j < size; j++){
			cin >> input_value;
			MyNewVector.push_back(input_value); //input_value from cin is added to the vector.
		}
		challenge.push_back(MyNewVector); //MyNewVector is added to challenge vector
	}
	
	// do the queries
	for(int k = 0; k < pieces_of_data_pulled; k++){
		cin >> row_number;
		cin >> col_number;
		cout << challenge[row_number][col_number]<<endl;
	}
	
    return 0;
}