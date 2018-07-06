import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
         //let's sort the array in ascending order first
        Arrays.sort(arr);
        
        //use ArrayList since we don't know the size of array that meet the smallest_difference criteria 
        ArrayList<Integer> difference = new ArrayList<Integer>();
        
	/*   let's assume the the smallest absolute difference is Integer.MAX_VALUE;
	We do this because we want  an initial value to this variable
	Integer.MAX_VALUE = 2147483647 */
        int smallest_difference = Integer.MAX_VALUE;
        
	/* let's loop through the array and check the difference between smallest_difference and the other elements. 
	After loop will will know the smallest difference between all elements */
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-arr[i-1] < smallest_difference){
		/* remove the elements from the ArrayList from the previous iteration. For example, if the smallest
		difference is at the last 2 elements in the array, then the array is filled with entries when the true
		smallest difference isn't discovered yet. */
                difference.clear();
                
		//if the difference is less than smallest_difference, then change value of smallest_difference
                smallest_difference = arr[i]-arr[i-1];
                
		//place elements in the ArrayList
                difference.add(arr[i]);
                difference.add(arr[i-1]);
            	}
	//Need to consider the case when one element is 0 and the order is the Maximum int value
		else if(arr[i]-arr[i-1] == smallest_difference){
		//place elements in the ArrayList
		difference.add(arr[i]);
		 difference.add(arr[i-1]);
		}
        }
        
        //sort ArrayList in ascending order
	Collections.sort(difference);
        
        
	//need to place elements from ArrayList into an Array 
        //create array the same size as difference  
        int[] newArray = new int[difference.size()];

		
	//fill in newArray
	for(int j = 0; j < newArray.length; j++){
		//use get method to access value at index in the ArrayList
		newArray[j] = difference.get(j);
	}

        
        //return the array
        return newArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
