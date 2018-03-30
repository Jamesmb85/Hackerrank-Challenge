#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a; //declare variable as an int
	int b; //declare variable as an int
	
	cin >> a; //this operation makes the program wait for input from cin;
	cin >> b; //this operation makes the program wait for input from cin;
		
	for(a,b; a<= b; a++){ //for values a and b, execute the loop if a is less than or equal to b. increase a by one each iteration
		if (a == 1){
			cout << "one\n";
		}
		else if (a == 2) {
			cout << "two\n";
		}
		else if (a == 3){
			cout << "three\n";
		}
		else if (a == 4){
			cout << "four\n";
		}
		else if (a == 5){
			cout << "five\n";
		}
		else if (a == 6){
			cout << "six\n";
		}
		else if (a == 7){
			cout << "seven\n";
		}
		else if (a == 8){
			cout << "eight\n";
		}
		else if (a == 9){
			cout << "nine\n";
		}
		else if ((a > 9) && (a%2 == 0)){
			cout << "even\n";
		}
		else if ((a > 9) && (a%2 != 0)){
			cout << "odd\n";
		}
	}  
		
    return 0;
}