package com.company;


import java.util.Scanner;


/*We define the following:

    A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.

    For example, if  array = [1,2,3], then the subarrays are [1],[2],[3],[1,2],[2,3], and [1,2,3] .

    Something like would [1,3] not be a subarray as it's not a contiguous subsection of the original array.

    The sum of an array is the total sum of its elements.
        An array's sum is negative if the total sum of its elements is negative.
        An array's sum is positive if the total sum of its elements is positive.

Given an array of integers, find and print its number of negative subarrays on a new line. */



public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //variables
        int numberOfNegativeSubArrays = 0;
        int sum = 0;


        System.out.println("What is the size of the array we are working with: ");
        int sizeOfMainArray = sc.nextInt();

        //create array
        int[] workingArray = new int[sizeOfMainArray];

        //fill in the array
        for(int i = 0; i < workingArray.length; i++){
            System.out.println("Enter the number you want to place in the array: ");
            workingArray[i] = sc.nextInt();
        }

        //nested loop to determine how many subarrays are negative
        // Pick starting point
        for(int j = 0; j < workingArray.length; j++){
            // Pick ending point
            for(int k = j; k < workingArray.length; k++){
                //this is the subarray between j  and k
                for(int q = j; q <= k; q++ ){
                    //add the values between j and k exclusive and then test if subarray has a negative sum
                    sum += workingArray[q];
                }
                //increase negative subarray count after inner most loop if necessary
                if(sum < 0){
                    numberOfNegativeSubArrays++;
                }
            }
        }

        System.out.println("The number of negative subarrays is: " + numberOfNegativeSubArrays);


        //close the scanner class
        sc.close();

    }


}










