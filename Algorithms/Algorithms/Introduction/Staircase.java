import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
        String symbol = "#";
        
        for(int i = 0; i < n; i++){         
            
/*
%a 	floating point (except BigDecimal) 	Hex output of floating point number
%b 	Any type 	“true” if non-null, “false” if null
%c 	character 	Unicode character
%d 	integer (incl. byte, short, int, long, bigint) 	Decimal Integer
%e 	floating point 	decimal number in scientific notation
%f 	floating point 	decimal number
%g 	floating point 	decimal number, possibly in scientific notation depending on the precision and value.
%h 	any type 	Hex String of value from hashCode() method.
%n 	none 	Platform-specific line separator.
%o 	integer (incl. byte, short, int, long, bigint) 	Octal number
%s 	any type 	String value
%t 	Date/Time (incl. long, Calendar, Date and TemporalAccessor) 	
    %t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x 	integer (incl. byte, short, int, long, bigint) 	Hex string.
*/
            //concatenate string
            System.out.printf("%"+n+"s%n",symbol);
            symbol += "#"; 
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
