#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
#include<string>
using namespace std;


int main() {
    
	int queries; //declare a variable queries of type int
	
	cin >> queries; //take input from the keyboard
	
	map<string,int> m; //Creates a map m where key_type is of type string and data_type is of type int.
	
	//use loop to print out key,value pair for students
	for(int i = 0; i < queries; i ++){
		
		int exam_id; //declare a variable exam_id of type int
		int t; //declare a variable t of type int
		string student_name;
		cin >> t; //take input from the keyboard
		
		switch(t){
			case 1:
				cin >> student_name; //take input from the keyboard
				cin >> exam_id; //take input from the keyboard
				
				//to test if a value is in a map
				if(m.find(student_name) == m.end()){
					//m.find() returns an iterator that points to the right value or points at the end of the map
					//Gives the iterator to the element student_name if it is found otherwise returns m.end()
					
					//add key value pair to m mapping
					m.insert(make_pair(student_name, exam_id));
					
				}
				else{
					//it->first and it->second is pointer to a struct that has fields first and second
					m.find(student_name)->second += exam_id; //second is the value in the map that is increased by the value exam_id
				}
				break;
			case 2:
				cin >> student_name;
				m.erase(student_name); //Erases the pair from the map where the key_type is x.
				break;
			case 3:
				cin >> student_name;
				//map<string, int>::iterator it = m.find(x) is an iterator that points to the right value or points at the end of the map
				map<string, int>::iterator it = m.find(student_name);
				
				//it != m.end() means as long as iterator doesn't equal the element after the last element in the mapping
				if(it != m.end()){
					//it->first and it->second is pointer to a struct that has fields first and second
					cout << it->second << endl; //prints out the value
				}
				else{
					cout << 0 << endl;
				}
				break;				
		}
	}
    return 0;
}