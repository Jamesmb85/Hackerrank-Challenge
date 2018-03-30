import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
		// Declare the object and initialize with predefined standard input object
        Scanner scan = new Scanner(System.in);
		
		// Numerical data input using similar-named functions.
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
		/* The java.util.Scanner.nextLine() method advances this scanner past the current line and returns the input 
		that was skipped. This method returns the rest of the current line, excluding any line separator at the end. 
		The position is set to the beginning of the next line. Since this method continues to search through the input 
		looking for a line separator, it may buffer all of the input searching for the line to skip if no line 
		separators are present. */
		scan.nextLine();
        
		// String input
		String s = scan.nextLine();
		
		/* If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads 
		integer tokens; because of this, the last newline character for that line of integer input is still queued 
		in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty). */

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

