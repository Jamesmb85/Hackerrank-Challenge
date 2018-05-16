import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner scan = new Scanner(System.in);
		
		//To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        int n = scan.nextInt();
		
		//define an Array called a of type int of size n
		int[] a  = new int[n];

		//fill the array
		for(int j = 0; j < a.length; j++){
			//during each iteration, read in a value and assign it to p
			int p = scan.nextInt();
			//assign value to array index
			a[j] = p;
		}
		
		scan.close();

        //print result of array
        //use for loop to iterate through array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}