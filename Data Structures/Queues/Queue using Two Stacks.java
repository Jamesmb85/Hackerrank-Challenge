package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/*A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed
from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element
added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

    Enqueue: add a new element to the end of the queue.
    Dequeue: remove the element from the front of the queue and return it.

In this challenge, you must first implement a queue using two stacks. Then process q queries, where each query is one of the following types:

    1 x: Enqueue element into the end of the queue.
    2: Dequeue the element at the front of the queue.
    3: Print the element at the front of the queue.
*/



public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of operations you want to perform on the Queue: ");
        //numerical input
        int operations = sc.nextInt();

        Stack<Integer> stackUsedForFront = new Stack<Integer>();
        Stack<Integer> stackUsedForBack = new Stack<Integer>();

        //clear the input line
        sc.nextLine();

        //use a for loop
        for(int i = 0; i < operations; i++){
            System.out.println("Available options \npress");
            System.out.println("1 - Enqueue element into the end of the queue. \n" +
                    "2 - Dequeue the element at the front of the queue.\n" +
                    "3 - Print the element at the front of the queue..\n");

            //read in option
            int option = sc.nextInt();

            //use switch statement
            switch (option){
                case 1:
                    System.out.println("Enter the integer you want to add to the end of the queue: ");
                    int input = sc.nextInt();

                    stackUsedForFront.push(input);

                    //clear the input line
                    sc.nextLine();

                    break;
                case 2:
                    // move all the elements from stackUsedForBack to stackUsedForFront
                    //check to see if stackUsedForFront is empty
                    if(stackUsedForBack.isEmpty() ){
                        //check to see if stackUsedForBack is empty
                        while(!stackUsedForFront.isEmpty() ){
                            //pop from stackUsedForBack and push to front
                            stackUsedForBack.push(stackUsedForFront.pop() );
                        }
                    }
                    //pop from stackUsedForFront
                    stackUsedForBack.pop();
                    break;
                case 3:
                    // move all the elements from stackUsedForBack to stackUsedForFront
                    //check to see if stackUsedForFront is empty
                    if(stackUsedForBack.isEmpty() ){
                        //check to see if stackUsedForBack is empty
                        while(!stackUsedForFront.isEmpty() ){
                            //pop from stackUsedForBack and push to front
                            stackUsedForBack.push(stackUsedForFront.pop() );
                        }
                    }
                    System.out.println(stackUsedForBack.peek() );

            }
        }

    }


}










