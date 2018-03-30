#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

//A data structure is a group of data elements grouped together under one name. 
//These data elements, known as members, can have different types and different lengths
struct Student{ //declare a struct called student
    int age;  //struct member of type int
    string first_name; //struct member of type string
    string last_name; //struct member of type string
    int standard; //struct member of type int
};

int main() {
    Student st; //object name st is created. It is of type student
    
    cin >> st.age >> st.first_name >> st.last_name >> st.standard; //input stream to assign struct member values
    cout << st.age << " " << st.first_name << " " << st.last_name << " " << st.standard; //output stream showing the struct member values
    
    return 0;
}
