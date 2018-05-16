import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
            
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);
        
		//To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        String A=sc.next();
        String B=sc.next();
		
		
        /* Enter your code here. Print output to STDOUT. */
        //call length method and assign it to variable of type int
        int letterLength = A.length() + B.length();
        System.out.println(letterLength);
        
        
        //use the compareTo() method
        //The java string compareTo() method compares the given string with current string lexicographically. It returns 
        //positive number, negative number or 0.
        int result = A.compareTo(B);
        if(result > 0){
			//if A doesn't come before B, then return a number greater than 0
            
            System.out.println("Yes");
        }
        else{
            //if A comes before B, then return a number less than 0
            System.out.println("No");
        }
        
        
        
        //capitalize the first letter in each string and print them out with a space in between
        //will use the substring method
        //then combine all of the elements
        
		//String substring(int beginIndex): Returns the substring starting from the specified index(beginIndex) till the 
        //end of the string. The range is not inclusive
		
		//The java string toUpperCase() method returns the string in uppercase letter. In other words, it converts all characters of the string into upper case letter.
		//The toUpperCase() method works same as toUpperCase(Locale.getDefault()) method. It internally uses the default locale.
        
		String capitalLetterFirstWord = A.substring(0, 1).toUpperCase();
        String capitalLetterSecondWord =  B.substring(0, 1).toUpperCase();
        
        System.out.println(capitalLetterFirstWord + A.substring(1) + " " + capitalLetterSecondWord + B.substring(1));
        
        
    }
}
