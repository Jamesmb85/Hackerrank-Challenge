#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    
    int n; //declare variable of type int
	int values; //declare variable of type int
	int Q; //declare variable of type int
    vector<int> v; //create vector of type int called v
    
    cin >> n; //take input from keyboard and assign to n. this is the number of integers
    
	for(int i=0;i<n;i++) //loop to fillout the vector
    {
        cin >> values; //take input from keyboard and assign to values. 
        v.push_back(values); //values is assign to the end of the vector
    }
    
    cin >> Q; //take input from keyboard and assign to Q. this the number of queries
    for(int i=0;i<Q;i++)
    {
        cin >> values; //take input from keyboard and assign to values.
		
		//The auto keyword specifies that the type of the variable that is begin declared will automatically be 
		//deduced from its initializer and for functions if their return type is auto then that will be evaluated 
		//by return type expression at runtime.
        auto r = lower_bound(v.begin(),v.end(),values);
		
		//Iterator lower_bound (Iterator first, Iterator last, const val)
		//lower_bound returns an iterator pointing to the first element in the range [first,last) which has a value not less than ‘val’.
		//v.begin() Returns an iterator pointing to the first element in the vector.
		//v.end() Returns an iterator referring to the past-the-end element in the vector container.
		//The past-the-end element is the theoretical element that would follow the last element in the vector. 
		//It does not point to any element, and thus shall not be dereferenced.
		
		//An iterator is any object that, pointing to some element in a range of elements (such as an array or a container), 
		//has the ability to iterate through the elements of that range using a set of operators (with at least the increment (++) and dereference (*) operators).

        if(values == *r) //if the value you input equals the value at the lower_bound position, then print yes 
            cout << "Yes ";
        else
            cout << "No ";

        cout << r-v.begin()+1 << endl; //v.begin()+1 is the second element of the vector
    }
    

    return 0;
}