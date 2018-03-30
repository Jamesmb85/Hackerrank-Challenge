#include <iostream>
#include <sstream>
using namespace std;

class Student{

public: //access modifier
//Accessor Functions - return our member variables
   int get_age(){
	   return age;
   }
   string get_first_name(){
	   return first_name;
   }
   string get_last_name(){
	   return last_name;
   }
   
   int get_standard(){
	   return standard;
   }
 //Mutator Functions - will allow us to edit each of the member variables one at a time  
   void set_age(int NewAge){
	   age = NewAge;
   }
   
   void set_first_name(string NewFirstName){
	   first_name = NewFirstName;
   }
   
   void set_last_name(string NewLastName){
	   last_name = NewLastName;
   }
      
   void set_standard(int NewStandard){
	   standard = NewStandard;
   }
    
   string to_string(){
       stringstream ss;
	   char c = ',';
	   ss << age << c << first_name << c << last_name << c << standard;
	   return ss.str();
   }
    
private: //access modifier
//member variables will go here becasue you don't want them chang
    int age;
    string first_name;
    string last_name;
    int standard; 
        
};

int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st; //create our object from the Student class
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}
