import java.io.*;
import java.util.*;

public class Solution {
	    static boolean isAnagram(String a, String b) {
        // Complete the function
		
		//declare the strings
        String first;
        String second;
        
        //covert string to lowercase to handle case difference
		//assign to empty strings above
        first = a.toLowerCase();
        second = b.toLowerCase();
        
        //convert each string to a char array
        char Array1[] = first.toCharArray();
        char Array2[] = second.toCharArray();
        
        //sort each Array
		//The java.util.Arrays.sort(int[]) method sorts the specified array of ints into ascending numerical order.
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        
        //compare the Arrays
		//The java.util.Arrays.equals(Object[] a, Object[] a2) method returns true if the two specified arrays 
		//of objects are equal to one another.The two arrays are considered equal if both arrays contain the 
		//same number of elements, and all corresponding pairs of elements in the two arrays are equal
        if(Arrays.equals(Array1, Array2)){
             return true;
        }
        else{
            return false;
        }
    }
	
	public static void main(String[] args) {
	// Declare the object and initialize with predefined standard input object
	Scanner scan = new Scanner(System.in);
	
	// String input
	String a = scan.next();
	String b = scan.next();
	
	//stop input from the Scanner class
	scan.close();
	
	//call isAnagram function. True or False is assigned to ret
	boolean ret = isAnagram(a, b);
	
	//print out string depending on boolean value
	System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}