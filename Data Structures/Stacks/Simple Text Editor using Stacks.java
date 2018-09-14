package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*In this challenge, you must implement a simple text editor. Initially, your editor contains an empty string, S.
You must perform Q operations of the following types:

1. append - Append string W to the end of S.
2. delete - Delete the last K characters of S.
3. print - Print the kth character of S.
4. undo - Undo the last (not previously undone) operation of type 1 or 2, reverting to the state it was in prior to that operation.*/



public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String workingString = ""; //empty string

        System.out.println("Enter the number of operations you want to perform on the empty string");

        //numerical input
        int numberOfOperations = sc.nextInt();

        //clear the input line
        sc.nextLine();

        //before entering loop, let's create a Deque of Integers backed by an Array
        Deque<String> stringStack = new ArrayDeque<String>();

        //push the initial string to the stack
        stringStack.push(workingString);

        //use a for loop
        for(int i = 0; i < numberOfOperations; i++){
            System.out.println("Available options \npress");
            System.out.println("1 - Append string W to the end of S. \n" +
                    "2 - Delete - Delete the last K characters of S.\n" +
                    "3 - Print - Print the kth character of S..\n" +
                    "4 - undo - Undo the last (not previously undone) operation of type 1 or 2");

            //read in option
            int option = sc.nextInt();

            //use switch statement
            switch (option){
                case 1:
                    System.out.println("Enter the string you want to append to S");
                    String append = sc.next();
                    //concatenate strings
                    workingString += append;
                    //add string to the stack
                    stringStack.push(workingString);

                    //clear the input line
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("How many characters do you want to remove from the string? ");
                    int charactersToRemove = sc.nextInt();
                    /*ok, so essentially we are keeping a substring. For example, if our string is abcd and we want to remove the last
                    * 2 characters we return ab and place it in the stack.
                     The substring function start at 0 and goes until the end of the string(not inclusive) minus the characters to remove.
                     So, we have abcd.substring(0, 4-2) which is ab since substring is not inclusive for the ending index */
                    workingString = workingString.substring(0, workingString.length() - charactersToRemove );

                    //add string to the stack
                    stringStack.push(workingString);

                    //clear the input line
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("What is the position of the character you want to see? ");
                    int characterPosition = sc.nextInt();
                    System.out.println("The character at position " + characterPosition + " is " + workingString.charAt(characterPosition-1) );
                    //clear the input line
                    sc.nextLine();
                    break;
                case 4:
                    //we need to undo the last action if 1 or 2 was entered. So, we need to pop the stack since the top of the stack contains the modified string
                    stringStack.pop();
                    //set string to the value at the top of the stack
                    workingString = stringStack.peek();
                    break;
                default:
                    break;

            }

        }



    }


}










