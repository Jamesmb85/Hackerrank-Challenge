import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
            
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
                
            }
            
            //once loop above finds the correct position, we need to insert value into the last value of j
            arr[j] = newElement;
            
            //print array after newElement is inserted
            for(int p = 0; p < arr.length; p++){
                System.out.print(arr[p]+ " ");
            }
            
            //after outer loop finishes iteration, print next sorted array on a new line
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
