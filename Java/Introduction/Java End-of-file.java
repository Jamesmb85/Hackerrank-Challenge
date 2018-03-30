import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //line number
        int counter = 1;
        
        // Declare the object and initialize with predefined standard input object
        Scanner sc = new Scanner(System.in);
        
        //sc.hasNextLine() retuns true if there is a line to read from the std input
        while( sc.hasNextLine() ){
            //read in the string
            String line = sc.nextLine();
            //print of the line
            System.out.println(counter + " " + line);
            //increase counter by 1
            counter++;
        }
    }
}