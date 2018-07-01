import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        //we know the length of is less than 100
        //we need to create an array to contain the count of each instance
        int[] countArray = new int[100];
        
        //need to transverse through arr and increase the value at each index by 1 if value exists. The value at each index starts at 0 since we have an empty array
        for(int i = 0; i < arr.length; i++){
			/* This line count how many instances of each value we have
			for i = 0, countArray[arr[0]]++]  means to increase the value at index 0 from 0 to 1
			
			Assume arr[0] == arr[1]
			Then for i = 1, countArray[arr[1]]++]  means to increase the value at index 0 from 1 to 2
			
			Assume arr[0] is different than arr[1]
			Then i = 1, countArray[arr[1]]++]  means to increase the value at index 1 from 0 to 1
			
			and so on .....
			Final result is countArray will have the nuber of instances for each number
			*/
            countArray[arr[i]]++;
        }
        
        return countArray;

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

        int[] result = countingSort(arr);

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
