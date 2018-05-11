import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        
        //since we know the array is only 5 elements, we need 5 variables and each is a different value
        //and then another 5 to place the results
        long first_element = arr[0];
        long second_element = arr[1];
        long third_element = arr[2];
        long fourth_element = arr[3];
        long fifth_element = arr[4];
        long sum1;
        long sum2;
        long sum3;
        long sum4;
        long sum5;
        long [] newArray = new long [5]; //declaration and instantiation an array of size 5
        long array_length = arr.length;
        long smallest;
        long largest;
        
        //need to loop through array and add the elements at each index. If index # is a certain value, don't include 
        //that index
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                 sum1 = second_element + third_element + fourth_element + fifth_element;
                 newArray[i] = sum1; //place sum1 at current index
            }
            
            else if(i == 1){
                sum2 = first_element + third_element + fourth_element + fifth_element;
                newArray[i] = sum2; //place sum2 at current index
            }
            
            else if (i == 2){
                sum3 = first_element + second_element + fourth_element + fifth_element;
                newArray[i] = sum3; //place sum3 at current index
            }
            
            else if(i == 3){
                sum4 = first_element + second_element + third_element + fifth_element;
                newArray[i] = sum4; //place sum4 at current index
            }
            
            else if(i == 4){
                sum5 = first_element + second_element + third_element + fourth_element;
                newArray[i] = sum5; //place sum5 at current index
            }
            
        }
        
        //since we have a small array, use the bubble sort
        for(int j = 0; j < newArray.length - 1; j++){
            for(int k = 0; k < newArray.length - j - 1; k++ ){
                //test to since which value is bigger
                if(newArray[k] > newArray[k+1]){
                    //swap values
                    long temp = newArray[k];
                    newArray[k] = newArray[k+1];
                    newArray[k+1] = temp;
                }
            }
        }
        
        
        smallest = newArray[0];
        largest = newArray[newArray.length - 1];
        
        System.out.println(smallest + " " + largest);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
