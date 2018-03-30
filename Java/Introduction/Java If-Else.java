    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
			// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
            Scanner sc=new Scanner(System.in);
			
			// Numerical data input
			//To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
            int n=sc.nextInt();            
            
			//declare a variable as an empty string
			String ans="";
			
            if(n%2==1){
              ans = "Weird";
            }
            
            else if( (n%2==0) && (n >=2 && n <=5) ){
                ans = "Not Weird";
            }
            
            else if ( (n%2==0) && (n >=6 && n <=20) ){
                ans = "Weird";
            }
            
            else if ( (n%2==0) && ( n >20) ){
            
               ans = "Not Weird";              
                
            }
            System.out.println(ans);
            
        }
    }
