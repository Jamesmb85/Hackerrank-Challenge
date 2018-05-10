import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
		 
		//variables
        int size_of_array = arr.length;
        
        double positive_elements = 0.0;
        double negative_elements = 0.0;
        double zero_elements = 0.0;
        
        //need to loop through array to see which elements are positive, negative, and zero
        for(int i = 0; i < size_of_array; i++){
            //test to see if element is positive
            if(arr[i] > 0){
                positive_elements += 1; //increase variable by 1
            }
             //test to see if element is negative
            else if (arr[i] < 0){
                negative_elements += 1; //increase variable by 1
            }
             //not positive or negative so must be eqaul to 0
            else{
                zero_elements += 1; //increase variable by 1
            }
            
        }
        
        System.out.println(positive_elements/size_of_array);
        System.out.println(negative_elements/size_of_array);
        System.out.println(zero_elements/size_of_array);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
