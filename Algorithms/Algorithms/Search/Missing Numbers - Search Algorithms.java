package com.company;

import java.util.*;

/*Numeros the Artist had two lists that were permutations of one another. He was very proud.
Unfortunately, while transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the missing numbers?

As an example, the array with some numbers missing, [1,2,3,4,5] . The original array of numbers [1,2,3,4,5,6,7,8,9,10]. The numbers missing are [6,7,8,9,10].

Notes

If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same.
If that is not the case, then it is also a missing number.

You have to print all the missing numbers in ascending order.

Print each missing number once, even if it is missing multiple times.

The difference between maximum and minimum number in the second list is less than or equal to .
 */


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many elements are in the first array: ");
        int sizeOfArrayOne = sc.nextInt();
        System.out.println("How many elements are in the second array: ");
        int sizeOfArrayTwo = sc.nextInt();

        //create two arrays of the sizes above
        int[] arrayOne = new int[sizeOfArrayOne];
        int[] arrayTwo = new int[sizeOfArrayTwo];

        //since we don't know the size of the tempArray, let's use a Dynamic Array, i.e. ArrayList that we can resize
        List<Integer> missingRecords = new ArrayList<Integer>();

        //fill in the first array
        for(int i = 0; i < sizeOfArrayOne; i++){
            System.out.println("Enter the integer into the first array: ");
            arrayOne[i] = sc.nextInt();
        }

        //fill in the second array
        for(int j = 0; j < sizeOfArrayTwo; j++){
            System.out.println("Enter the integer into the second array: ");
            arrayTwo[j] = sc.nextInt();
        }



        /*We need to iterate through the arrays and compare each value */
        for(int k = 0; k < sizeOfArrayTwo; k++){
            /*Ok, we need to check each element and compare each value. Something we need to consider:
             * 1. Since arrayTwo is larger, we need to stop once we reach the size of arrayTwo and place all remaining values from arrayTwo in the temp Array
               * This applies only if those values don't already exist in the temp array*/

            //try to compare index values for an index that doesn't exist
            try{
                //if the values at both indexes in each array aren't equal and it doesn't exist in the missingRecords array
                if( (arrayOne[k] != arrayTwo[k]) & missingRecords.indexOf(arrayTwo[k]) != -1  )  {
                        missingRecords.add(arrayTwo[k]);
                }

            }
            //catch the out of bounds exception
            catch (ArrayIndexOutOfBoundsException e){
                //add value from larger array to temp array
                missingRecords.add(arrayTwo[k]);
            }



        }

        //sort missing records
        Collections.sort(missingRecords);

        //print out missing records
        for(int p = 0; p < missingRecords.size(); p++){
            System.out.print(missingRecords.get(p) + " ");
        }

    }


}










