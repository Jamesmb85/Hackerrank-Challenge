import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
	    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			//string input from scanner class
			String stringToMatch = in.nextLine();
          	//Write your code
            
            //use a try-catch block
            try{
				/* compile()– Used to create a pattern object by compiling a given string that may contain regular expressions. 
				Input may also contains flags like Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, .. etc */
                Pattern.compile(stringToMatch);
                System.out.println("Valid");
            }
			//PatternSyntaxException– Used for indicating syntax error in a regular expression pattern
            catch(PatternSyntaxException exception)
            {
                
                System.out.println("Invalid");
            }
            
            
		}
	}
}



