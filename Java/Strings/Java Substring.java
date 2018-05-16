import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner in = new Scanner(System.in);
		
		//To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
		
		System.out.println(S.substring(start, end));
    }
}