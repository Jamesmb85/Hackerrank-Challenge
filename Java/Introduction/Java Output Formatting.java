//Import the Scanner Class
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
			// Declare the object and initialize with predefined standard input object
            Scanner sc=new Scanner(System.in);
            
			System.out.println("================================");
            
			for(int i=0;i<3;i++){
				// String input
                String s1=sc.next();
                
				// Numerical data input using similar-named functions.
				int x=sc.nextInt();
                
				//Complete this line
				//-15s means left justified and the string can hold up to 15 characters. They are blank if the characters aren't there
                System.out.printf("%-15s",s1);
				//03d means the number is 3 spaces long and if the number is less than 3 spaces it is filled with 0s. The /n is a newline.
                System.out.printf("%03d\n", x);
            }
            System.out.println("================================");

    }
}