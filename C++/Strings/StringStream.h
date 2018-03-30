#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) 
{
    vector<int> vec;    // Declares a vector to store the ints
    stringstream ss(str);   // Declares a stringstream object to deal with the modification of the string
    char ch;
    int temp;
    
    while(ss)   // While the stringstream object does not hit a null byte
    {
        ss>>temp>>ch;   // Extract the comma seperated ints with the extraction >> operator
        vec.push_back(temp);   // Push the int onto the vector
    } 
    
    return vec; // Return the vector of ints
}

int main() {
    string str; //variable str is declared as a string
    cin >> str; //string str is recieved from the standard input stream
    vector<int> integers = parseInts(str); //the parseInts vector is assigned to another vector called integers
    for(int i = 0; i < integers.size(); i++) { //for loop continues until i is greater than the size of the integers vector
        cout << integers[i] << "\n"; //every entry in the integers vector is displayed on a new line
    }
    
    return 0;
}


