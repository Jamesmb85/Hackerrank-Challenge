import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        //first element of array is the pivot
        int pivot = arr[0];
                
        //use ArrayList since we don't know the size of subarrays
        ArrayList<Integer> lessthan = new ArrayList<Integer>();
        ArrayList<Integer> equalto = new ArrayList<Integer>();
        ArrayList<Integer> greaterthan = new ArrayList<Integer>();
        ArrayList<Integer> combinedArray = new ArrayList<Integer>();
        
        //loop through arr and had to seaprate arraylist depending on value
        for(int i = 0; i < arr.length; i++){
            if(pivot > arr[i]){
                //call add method from ArrayList class
                lessthan.add(arr[i]);
            }
            else if(pivot < arr[i]){
                //call add method from ArrayList class
                greaterthan.add(arr[i]);
            }
            else if(pivot == arr[i]){
				//call add method from ArrayList class
                equalto.add(arr[i]);
			}
				
        }
        
        //combine all of the elements from the three ArrayList above
        combinedArray.addAll(lessthan);
        combinedArray.addAll(equalto);
        combinedArray.addAll(greaterthan);
        
        //need to place elements from ArrayList into an Array
        //create array the same size as combinedArray 
        int[] returnArray = new int[combinedArray.size()];
        
        for(int j = 0; j < returnArray.length; j++){
            //use get method to access value at index in the ArrayList
            returnArray[j] =  combinedArray.get(j);
        }
        
        //return the newly filled in array
        return returnArray;
        
        

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

        int[] result = quickSort(arr);

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
