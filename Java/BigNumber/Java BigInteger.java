import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  		
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner n = new Scanner(System.in);
		
		//assign value to BigInterger instance
		//next() function returns the next token/word in the input as a string
        BigInteger b1 = new BigInteger(n.next());
        BigInteger b2 = new BigInteger(n.next());
        
		//The java.math.BigInteger.add(BigInteger val) returns a BigInteger object whose value is (this + val).
        System.out.println(b1.add(b2));
		//The java.math.BigInteger.multiply(BigInteger val) returns a BigInteger whose value is (this * val).
        System.out.println(b1.multiply(b2));
    }
}