import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the reverseArray function below.
     */
    static int[] reverseArray(int[] a) {
        /*
         * Write your code here.
         */
        
        //size of input array
        int size_of_array = a.length;
        
        //empty array of same size
        int[] b = new int[size_of_array];
            
        //counter to move array index forward
        int counter = 0;
        
        //loop through Array backwards. Start at the end of the array and loop to the front
        for(int i = size_of_array - 1; i >= 0; i--){
            //assign the value in a to b
            b[counter] = a[i];
            //increase counter by 1 to move to the next index after assignment
            counter++;
        }
        
        //return the array
        return b;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
