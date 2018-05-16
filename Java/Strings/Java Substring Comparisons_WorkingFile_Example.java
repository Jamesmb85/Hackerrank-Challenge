package com.company;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s1 = "welcometojava";
        String[] myArray = new String[s1.length()-2];
        int k = 0;

        //iterate through string and put 3 characters in each index
        for(int i  = 0; i < s1.length() - 2; i++){
            myArray[i] = s1.substring(k, k + 3);
            k++;
        }

        for(int j = 0; j < myArray.length; j++ ){
            System.out.print(myArray[j]+ " ");
        }

        ///BubbleSort
        //this outer loop moves to each index and compare that string to every string
        for(int p = 0; p < myArray.length-1; p++){
            //this inner loop the first string to every other substring
            //compare each index with the next one and sort them lexicographically
            for(int m = 0; m < myArray.length-1; m++){
                //use the compareTo() method
                //checking to see if current substring is lexicographically greater than the next
                if(myArray[m].compareTo(myArray[m+1]) > 0){
                    //need a temp variable to swap position if current string is greater than the next 3-character string
                    //need to save larger string to a variable before swapping positions
                    String tempVariable = myArray[m];
                    //smaller string swaps positions with larger string
                    myArray[m] = myArray[m+1];
                    myArray[m+1] = tempVariable;
                }
                //checking to see if current substring is lexicographically less than the next
                if(myArray[m].compareTo(myArray[m+1]) < 0){
                    //if current string is smaller lexicographically, then continue to the next index
                    continue;
                }
                //checking to see if current substring is lexicographically equal than the next
                if(myArray[m].compareTo(myArray[m+1]) == 0){
                    //if strings are equal then compareTo return 0
                    continue;
                }

            }
        }

        System.out.println("\n");

        //print out lexicographically array
        for(int n = 0; n < myArray.length; n++){
            System.out.print(myArray[n] + " ");
        }

        System.out.println("\n");

        System.out.println("Smallest lexicographically 3 string in this array is " + myArray[0]);
        System.out.println("Smallest lexicographically 3 string in this array is " + myArray[myArray.length-1]);


    }
}
