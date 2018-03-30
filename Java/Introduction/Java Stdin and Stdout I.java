import java.util.*;

public class Solution {

    public static void main(String[] args) {
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner scan = new Scanner(System.in);
		
		// Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}