//Lines beginning with a hash sign (#) are directives read and interpreted by what is known as the preprocessor.
#include <iostream>

//This library uses what are called streams to operate with physical devices such as keyboards, printers, terminals or 
//with any other type of files supported by the system.
//Streams are handled in the cstdio library as pointers to FILE objects. 
//A pointer to a FILE object uniquely identifies a stream, and is used as a parameter in the operations involving that stream.
#include <cstdio> 

using namespace std;
//The above declaration allows all elements in the std namespace to be accessed in an unqualified manner (without the std:: prefix)


int main() {
    int a; //declare variable as an int
	long b; //declare variable as a long
	char c; ////declare variable as a char
	float d; //declare variable as a float 
	double e; //declare variable as a double
	
	scanf("%d %ld %c %f %lf", &a, &b, &c, &d, &e); //read a data type, use the following syntax: scanf("`format_specifier`", &val)
	
	printf("%d\n",a); //To print a data type, use the following syntax: printf("`format_specifier`", val)
	printf("%ld\n",b);
	printf("%c\n",c);
	printf("%3f\n",d);
	printf("%9lf\n",e);
	// \n means a newline
	
    return 0;
}