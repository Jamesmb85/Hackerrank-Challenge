/* Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes 
while sorting? The only thing you should print is the number of shifts made by the algorithm to completely 
sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if 
it is not necessary.
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
        
        int counter = 0;
        
        //start index at 1 since assumed first element is the the sorted partition
        for(int firstUnsortedPartition = 1; firstUnsortedPartition < arr.length; firstUnsortedPartition++){
            
            //this is the value we are going to insert
            int newElement = arr[firstUnsortedPartition];
            
            int j;
            
            
            /* The second for loop looks for the correct insertion position for the element we want to add into the     
            sorted partition. As it does so, it shifts elements in the sorted partition to the right, to make room for 
            the element we want to add. */
            for(j = firstUnsortedPartition; j>0 && arr[j-1] > newElement; j-- ){
                /* j > 0 && intArray[j - 1] > newElement means enter loop if we aren't at the front of the array
				and the number at the current position is greater than what we are trying to insert*/
                arr[j] = arr[j-1]; //shift value to the right
                counter++;
                
            }
            
            //once loop above finds the correct position, we need to insert value into the last value of j
            arr[j] = newElement;

            
        }
        return counter;

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

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
