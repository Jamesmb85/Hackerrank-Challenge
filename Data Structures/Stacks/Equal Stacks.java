package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a
stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they're all the same height,
then print the height. The removals must be performed in such a way as to maximize the height. */

public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //read in the size of the 3 stacks
        System.out.println("Enter the size of stack one ");
        int stackOne = sc.nextInt();
        System.out.println("Enter the size of stack two ");
        int stackTwo = sc.nextInt();
        System.out.println("Enter the size of stack three ");
        int stackThree = sc.nextInt();

        //need to create 3 Deque
        Deque<Integer> s1 = new ArrayDeque<Integer>();
        Deque<Integer> s2 = new ArrayDeque<Integer>();
        Deque<Integer> s3 = new ArrayDeque<Integer>();

        //need 3 variables to account for the sum of the values in each stack
        int sumOfStackOne = 0;
        int sumOfStackTwo = 0;
        int sumOfStackThree = 0;
        int counter = 0;

        //fill in stack #1
        for(int i = 0; i < stackOne; i++){
            System.out.println("Type in value to add to stack #1: ");
            int value = sc.nextInt();
            s1.push(value);
            //increase sum by value that was pushed
            sumOfStackOne += value;
        }

        //fill in stack #2
        for(int j = 0; j < stackTwo; j++){
            System.out.println("Type in value to add to stack #2: ");
            int value = sc.nextInt();
            s2.push(value);
            //increase sum by value that was pushed
            sumOfStackTwo += value;
        }

        //fill in stack #3
        for(int k = 0; k < stackThree; k++){
            System.out.println("Type in value to add to stack #3: ");
            int value = sc.nextInt();
            s3.push(value);
            //increase sum by value that was pushed
            sumOfStackThree += value;
        }

        //check the size before the loop
        System.out.println("Value before removing item from stack 1 is " + sumOfStackOne);
        System.out.println("Value before removing item from stack 2 is " + sumOfStackTwo);
        System.out.println("Value before removing item from stack 3 is " +sumOfStackThree);
        System.out.println("\n");

        /*We need to pop elements off each deque until their sums are equal. Let's use a while loop to  do that.
         * Also, if two of the sums are equal and less than the third sum, we pop off from the third deque */
        while( !(sumOfStackOne == sumOfStackTwo && sumOfStackOne == sumOfStackThree && sumOfStackTwo == sumOfStackThree) ){
            //need to accunt for when all of the sums are zero
            if (sumOfStackOne == 0 && sumOfStackTwo == 0 && sumOfStackThree == 0){
                break; //need to do nothing
            }
            else if(sumOfStackOne >= sumOfStackTwo && sumOfStackOne >= sumOfStackThree){
                //remove the amount from the sum
                sumOfStackOne -= s1.peek();
                //remove from stack 1
                s1.pop();
                //increase counter
                counter++;
            }
            else if(sumOfStackTwo >= sumOfStackOne && sumOfStackTwo >= sumOfStackThree){
                //remove the amount from the sum
                sumOfStackTwo -= s2.peek();
                //remove from stack 1
                s2.pop();
                //increase counter
                counter++;
            }
            else if(sumOfStackThree >= sumOfStackOne && sumOfStackThree >= sumOfStackTwo){
                //remove the amount from the sum
                sumOfStackThree -= s3.peek();
                //remove from stack 1
                s3.pop();
                //increase counter
                counter++;
            }
        }

        //at this point after the loop we can print any of the sums since they should be the same
        System.out.println("Value after removing item from stack 1 is " + sumOfStackOne);
        System.out.println("Value after removing item from stack 2 is " + sumOfStackTwo);
        System.out.println("Value after removing item from stack 3 is " + sumOfStackThree);
        System.out.println("The amount of times a stack was popped was " + counter);

        //close the scanner class
        sc.close();

    }

}
