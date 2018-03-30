#include <iostream>
#include <cstdio>
using namespace std;

int max_of_four(int a, int b, int c, int d){ //functon max_of_four takes 4 arguments
	if (a > b && a > c && a > d) //check to see if a is the largest
		return a;
	
	else if (b > a && b > c && b > d) //check to see if b is the largest
		return b;
	
	else if (c > a && c > b && c > d) //check to see ifca is the largest
		return c;
	else
		return d; //otherwise d is the largest
	
}

int main() {
    int a, b, c, d; //4 variables defined an int
    scanf("%d %d %d %d", &a, &b, &c, &d); //read a data type, use the following syntax: scanf("`format_specifier`", &val)
    int ans = max_of_four(a, b, c, d); //call function max_of_four with its arguments and assign it to ans
    printf("%d", ans); //print ans as a double
    
    return 0;
}
