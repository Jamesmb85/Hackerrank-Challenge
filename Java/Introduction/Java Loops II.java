import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
		// Declare the object and initialize with predefined standard input object
        Scanner in = new Scanner(System.in);
		// Numerical data input using similar-named functions.
        int t=in.nextInt();
        for(int i=0;i<t;i++){
			// Numerical data input using similar-named functions.
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
			//loop continues until you reach the exponent limit, n			
            for(int j=0; j<n; j++){
                a = a +(int)Math.pow(2,j)*b;
				//all of the values are printed on the same line
                System.out.print(a + " ");
            }
        //after each t, printing is started on a new line    
        System.out.println();
        }
        
        
        in.close();
    }
}