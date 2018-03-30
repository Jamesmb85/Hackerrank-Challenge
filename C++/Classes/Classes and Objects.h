#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;


class Student{

public: //access modifier
//Mutator Functions - will allow us to edit each of the member variables one at a time 
	void input();
	int calculateTotalScore();

	
private: //access modifier
//member variables will go here becasue you don't want them change
	int scores[5]; //an array of length 5 of type int
        
};

//scope operator (::, two colons) is used in the definition of function input to define a member of a class outside 
//the class itself.
void Student::input() {
	
	for(int i = 0; i < 5; i++){
		int s; //delcare s as an int
		cin >> s; //input come from keyboard
		
		scores[i] = s;//value s is stored at position i in array 
	}
	
} 

//scope operator (::, two colons) is used in the definition of function input to define a member of a class outside 
//the class itself.
int Student::calculateTotalScore() {
	int sum = 0; //declare sum as an int and intialize as 0
	
	for (int i = 0; i < 5; i++) {
				
		sum += scores[i]; //during each iteration of loop, the value of score[i] is added to sum
		
	}
	return sum;
}




int main() {
    int n; // number of students
    cin >> n;
    Student *s = new Student[n]; // an array of n students of type Student
    
    for(int i = 0; i < n; i++){
        s[i].input(); //object s calls input method which assigns value from cin to index position 
    }

    // calculate kristen's score
    int kristen_score = s[0].calculateTotalScore(); //object s calls calculateTotalScore method and assigns value to the 0 index

    // determine how many students scored higher than kristen
    int count = 0; 
    for(int i = 1; i < n; i++){
        int total = s[i].calculateTotalScore(); //object s calls calculateTotalScore method and assigns value to a different index for each iteration of loop
        if(total > kristen_score){
            count++;
        }
    }

    // print result
    cout << count;
    
    return 0;
}
