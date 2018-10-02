package com.company;

import java.util.Scanner;

/* 		Write a program that rotates an array of any size to the left or right.

		Want to expand on what [(j+numberOfRotations)% arraySize] is doing
		
		This is finding the index of using the arraySize and number of rotations
		
		Let's say we have an array called sample = {1,2,3,4,5}
		Let's say we want to do 2 left-rotations and now the array is when printed {3,4,5,1,2}
		
		I don't rotate the array and then print it, i just print starting at a certain index and make 
		sure i print the elements with the rotated array elements in the back.
		
		The key is making sure I'm at the current index to start
		
		Let's look at the iterations for the loop above
		
		First --> j = 0, numberOfRotations = 2, arraySize = 5 and we get ((0+2)%5) = 2 because 5 divides into 2 0 times and has a remainder of 2
		Second --> j =1, numberOfRotations = 2, arraySize = 5 and we get ((1+2)%5) = 3 because 5 divides into 3 0 times and has a remainder of 3
		Third --> j =2, numberOfRotations = 2, arraySize = 5 and we get ((2+2)%5) = 4 because 5 divides into 4 0 times and has a remainder of 4
		Fourth --> j =3, numberOfRotations = 2, arraySize = 5 and we get ((3+2)%5) = 0 because 5 divides into 5 1 time and has a remainder of 0
		Fifth --> j =4, numberOfRotations = 2, arraySize = 5 and we get ((4+2)%5) = 1 because 5 divides into 6 1 times and has a remainder of 1
		
		So, it prints sample[2] sample[3] sample[4] sample[0] sample[1] which is {3,4,5,1,2}
		
		Similar logic to j+(rightArraySize-numberOfRightRotations))%rightArraySize, for 2-rotations we get
		
		(0 + (5-2)) % 5 = 3
		(1 + (5-2)) % 5 = 4
		(2 + (5-2)) % 5 = 0
		(3 + (5-2)) % 5 = 1
		(4 + (5-2)) % 5 = 2
		
		So, it prints sample[3] sample[4] sample[0] sample[1] sample[2] which is {4,5,1,2,3} */
		
		
		

		


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is the size of the array: ");
        int leftArraySize = sc.nextInt();
        System.out.println("How many times do you want to rotate the array to the left: ");
        int numberOfLeftRotations = sc.nextInt();

        //define array we want to rotate
        int[] firstArray = new int[leftArraySize];

        //fill in the array
        for(int i = 0; i < firstArray.length; i++){
            System.out.println("Enter the number into the array: ");
            firstArray[i] = sc.nextInt();
        }

        //print out elements
        for(int j = 0; j < firstArray.length; j++){
            System.out.print( firstArray[(j+numberOfLeftRotations)% leftArraySize] + " ");

        }

        System.out.println("\n");

        System.out.println("What is the size of the array: ");
        int rightArraySize = sc.nextInt();
        System.out.println("How many times do you want to rotate the array to the right: ");
        int numberOfRightRotations = sc.nextInt();

        //define array we want to rotate
        int[] secondArray = new int[rightArraySize];

        //fill in the array
        for(int i = 0; i < secondArray.length; i++){
            System.out.println("Enter the number into the array: ");
            secondArray[i] = sc.nextInt();
        }

        //print out elements
        for(int j = 0; j < secondArray.length; j++){
            System.out.print( secondArray[(j+(rightArraySize-numberOfRightRotations))%rightArraySize] + " ");

        }


        //close the scanner class
        sc.close();
    }

}