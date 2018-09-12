package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) 
occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. 
There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses 
encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given strings of brackets, determine whether each sequence of brackets is balanced. 
If a string is balanced, return YES. Otherwise, return NO.  */


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //numerical input
        System.out.println("Enter the number of brackets you want to check to see if they are balanced: ");
        int numberOfBrackets = sc.nextInt();

        //clear the input line
        sc.nextLine();


        /*Need to loop through the string and determine if is {[( or )]}
        We can assume all of the starting brackets come before the closing brackets.
        We can't assume the the closing brackets come in order. For examle {[}{]} is balanced even though the closing brackets don't
        come in order. Also, I would say that having an odd number of brackets makes it unbalanced.
        However, i will check  if the beginning and ending brackets match each iteration*/
        int loopCounter = 0;
        while(loopCounter < numberOfBrackets){
            //create Deque of type Character
            Deque<Character> bracketsStack = new ArrayDeque<Character>();

            //string input
            System.out.println("Enter the bracket you want to see if it is balanced or not. ");
            String balancedBrackets = sc.nextLine();

            //inner loop for each bracket
            for(int i = 0; i < balancedBrackets.length(); i++){
                    //need to convert string to char and find out if each char is an opening or closing bracket
                    //checking to see if is an open bracket
                    if(balancedBrackets.charAt(i) == '(' || balancedBrackets.charAt(i) == '[' || balancedBrackets.charAt(i) == '{' ){
                        //push front bracket to the stack
                        bracketsStack.push(balancedBrackets.charAt(i));
                    }
                    // If a closing bracket exist, the stack isn't empty, and the top of the stack equals the proper opening bracket, then pop it
                    else if(!balancedBrackets.isEmpty() &&  balancedBrackets.charAt(i) == ')' && bracketsStack.peek() == '(' ){
                        //pop from the stack
                        bracketsStack.pop();
                    }
                    else if(!balancedBrackets.isEmpty() &&  balancedBrackets.charAt(i) == ']' && bracketsStack.peek() == '[' ){
                        //pop from the stack
                        bracketsStack.pop();
                    }
                    else if(!balancedBrackets.isEmpty() &&  balancedBrackets.charAt(i) == '}' && bracketsStack.peek() == '{' ){
                        //pop from the stack
                        bracketsStack.pop();
                    }
                    //after inner for loop, if the brackets are balanced, then the stack should be empty
                }

            //print out if it is balanced our not
            if(bracketsStack.isEmpty() ){
                System.out.println("Balanced");
            }
            else{
                System.out.println("Not Balanced");
            }

            //go to the next bracket
            loopCounter++;
        }

        //close the scanner class
        sc.close();
    }

}










