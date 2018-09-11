/* You have an empty sequence, and you will be given queries. Each query is one of these three types:

1-Push the element x into the stack.
2-Delete the element present at the top of the stack.
3-Print the maximum element in the stack.

Input Format

The first line of input contains an integer, N. The next N lines each contain an above mentioned query. 
(It is guaranteed that each query is valid.)


Output Format

For each type 3 query, print the maximum element in the stack on a new line. */


package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of actions performed on the Stack: ");

        // Numerical data input
        int actions = sc.nextInt();

        //before entering loop, let's create a Deque of Integers backed back an Array
        Deque<Integer> intStack = new ArrayDeque<Integer>();

        //need to track the maximum element
        Deque<Integer> maxElement = new ArrayDeque<Integer>();

        //perform deque operations until actions = 0
        while(actions > 0){
            System.out.println("Available options \npress");
            System.out.println("1 - Push the element x into the stack. \n" +
                    "2 - Delete the element present at the top of the stack.\n" +
                    "3 - Print the maximum element in the stack");

            //numerical input
            int option = sc.nextInt();

            //use switch statement
            switch(option){
                case 1:
                    //read in the number you want to put
                    System.out.println("What number do you want to put at the top of the stack");

                    //numerical input
                    int pushNumber = sc.nextInt();

                    //call the push method for the Deque
                    intStack.push(pushNumber);


                    //check to see if pushNumber is greater than the element at the top or if stack is empty
                    if(maxElement.isEmpty() || pushNumber >= maxElement.peek() ){
                        //push maxElement to the top of the stack
                        maxElement.push(pushNumber);
                    }

                    //decrease the counter by the 1
                    actions--;
                    break;
                case 2:
                    int removedFromStack = intStack.pop();
                    System.out.println(removedFromStack + " was removed from the stack");

                    //check to see if element popped needs to be removed from maxElement
                    if(removedFromStack == maxElement.peek() ){
                        System.out.println(removedFromStack + " was removed from the MaxElement Deque");
                        maxElement.pop();
                    }

                    //decrease the counter by the 1
                    actions--;
                    break;
                case 3:
                    System.out.println("The max element is " + maxElement.peek() );
                    //decrease the counter by the 1
                    actions--;
                    break;
                default:
                    break;


            }
        }

        //close the scanner class
        sc.close();

    }

}









