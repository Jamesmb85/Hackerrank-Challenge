import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        		
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc=new Scanner(System.in);
		
		//To read numerical/string values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        String A=sc.next();
        
		/* Enter your code here. Print output to STDOUT. */
        //declare an empty string
		String B  = "";

		//int i = A.length()-1 is used because we need to start at the end of the string so we use the length and substract 1
        for(int i = A.length()-1; i >= 0; i--){
			//charAt returns the character located at the String's specified index. 
			//so we are starting at the end of the string and thus the last character will be return, then the second to last, etc. 
            B += A.charAt(i);
        }

		//Using ==  gives a wrong result because it is asking if A and B are the same object and they aren't
        if (A.equals(B)){
			//equals This method compares this string to the specified object. The result is true if and only if the argument 
			//is not null and is a String object that represents the same sequence of characters as this object.
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
