#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n; //declare variable as an int
    cin >> n; //this operation makes the program wait for input from cin;
    
	if (n <= 9){
		if (n == 1){
			cout << "one";
		}
		else if (n == 2) {
			cout << "two";
		}
		else if (n == 3){
			cout << "three";
		}
		else if (n == 4){
			cout << "four";
		}
		else if (n == 5){
			cout << "five";
		}
		else if (n == 6){
			cout << "six";
		}
		else if (n == 7){
			cout << "seven";
		}
		else if (n == 8){
			cout << "eight";
		}
		else if (n == 9){
			cout << "nine";
		}
	}
	else
		cout << "Greater than 9";
	
    return 0;
}
