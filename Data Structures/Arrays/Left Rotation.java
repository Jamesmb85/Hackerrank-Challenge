import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = scan.nextInt();
        int numberOfRotations = scan.nextInt();
        
        //define array we want to rotate
        int[] firstArray = new int[arraySize];
        
        //fill in the array
        for(int i = 0; i < firstArray.length; i++){
            firstArray[i] = scan.nextInt();
        }
        
        //print out elements starting at the index greater than the number of rotations
        for(int j = 0; j < firstArray.length; j++){
            System.out.print( firstArray[(j+numberOfRotations)% arraySize] + " ");
            
        }
		
/* 		Want to expand on what [(j+numberOfRotations)% arraySize] is doing
		
		This is finding the index of using the arraySize and number of rotations
		
		Let's say we have an array called sample = {1,2,3,4,5}
		Let's say we want to do 2 left-rotations and now the array is when printed {3,4,5,1,2}
		
		I don't rotate the array and then print it, i just print starting at a certain index and make 
		sure i print the elements with the rotated array elements in the back.
		
		The key is making sure I'm at the current index to start
		
		Let's look at the iterations for the loop above
		
		First --> j = 0, numberOfRotations = 2, arraySize = 5 and we get ((0+2)%5) = 2 because 5 divides into 2 0 times and has a remainder of 2
		Second --> j =1, numberOfRotations = 2, arraySize = 5 and we get ((1+2)%5) = 3 because 5 divides into 3 0 times and has a remainder of 3
		Third --> j =2, numberOfRotations = 2, arraySize = 5 and we get ((2+2)%5) = 4 because 5 divides into 4 0 times and has a remainder of 4
		Fourth --> j =3, numberOfRotations = 2, arraySize = 5 and we get ((3+2)%5) = 0 because 5 divides into 5 1 time and has a remainder of 0
		Fifth --> j =4, numberOfRotations = 2, arraySize = 5 and we get ((1+2)%5) = 1 because 5 divides into 6 1 times and has a remainder of 1
		
		So, it prints sample[2] sample[3] sample[4] sample[0] sample[1]
		
		*/
        
        
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
    }
}
