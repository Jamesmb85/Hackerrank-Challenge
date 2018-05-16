import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        
        //need an int array to place convert string elements
        int[] placeholder = new int[unsorted.length]; //int array is the same size of the String array
        
        //need to iterate through array and convert each element to an int
        for (int i = 0; i < unsorted.length; i++){
                int temp = Integer.parseInt(unsorted[i]); //convert string at index i and assign it to the temp variable
                placeholder[i] = temp;//place temp into int array
        }
        
        //can now use the built-in sort method
        Arrays.sort(placeholder);
        
        //convert back sorted array elements to strings
        for (int m = 0; m < placeholder.length; m++){
            String temp2 = placeholder[m].;
            unsorted[m] = temp2; //place temp2 into string array
        }
        
        return unsorted;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted[n]);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
