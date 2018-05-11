import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        
        //n is the number of candles
        int length_of_array = ar.length;
        int counter = 0;
		
		 //sort array in ascending order
        Arrays.sort(ar);
        
     /*    //using a bubble sort to sort array
		//using a bubble sort times out for very arge arrays. So, this method is not optimal. Used built-in method above
        for(int i = 0; i < ar.length - 1; i++){
            for(int j = 0; j < ar.length-i-1; j++){
                //compare values
                if(ar[j] > ar[j+1]){
                    //swap values
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        } */
        
        //tallest candle is the last in the array
        int tallest_candle_height = ar[length_of_array - 1];
        
        //need to count the number of times tallest_candle_height appears
        for(int k = 0; k < ar.length; k++){
            if(ar[k] == tallest_candle_height){
                counter++; //increase variable by 1
            }
        }
        
        return counter;
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
