import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		// Declare the object and initialize with predefined standard input object
        Scanner in = new Scanner(System.in);
		
		// Numerical data input using similar-named functions.
        int N = in.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + (N*i) );
        }
    }
}
