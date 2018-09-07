import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
    // generic method printArray
    public <E> void printArray(E[] inputArray){
        //print elements of inputArray
        for(int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    } 
 
}

/* You can write a single generic method declaration that can be called with arguments of different types. 
Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately. 

Following are the rules to define Generic Methods −

1. All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes 
the method's return type ( < E > in the next example).

2.Each type parameter section contains one or more type parameters separated by commas. 
A type parameter, also known as a type variable, is an identifier that specifies a generic type name.

3.The type parameters can be used to declare the return type and act as placeholders for the types of the arguments 
passed to the generic method, which are known as actual type arguments.

4. A generic method's body is declared like that of any other method. Note that type parameters can represent only 
reference types, not primitive types (like int, double and char). */



public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer(); //create instance of Printer Class
        Integer[] intArray = { 1, 2, 3 }; //integer array of size 3
        String[] stringArray = {"Hello", "World"}; //string array of size 2
        myPrinter.printArray(intArray); //call printArray method 
        myPrinter.printArray(stringArray); //call printArray method 
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}