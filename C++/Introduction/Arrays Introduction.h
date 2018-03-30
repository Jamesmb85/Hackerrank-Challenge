#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
	int n; //declares n as an int
    cin >> n; //input from keyboard is assgined to n
    int arr[n]; //an array of type int and size n is created
    
	for(int i = 0; i < n; i++){
		cin >> arr[i]; //type in the array elements and assigned them array location
	}	
    
	for(int k = n-1; k >= 0; k--){
		cout << arr[k] << " "; //print the array in reverse. k = n-1 starts at the second to last element and k-- moves to the left in the array
	}
}
