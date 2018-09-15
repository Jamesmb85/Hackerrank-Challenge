package com.company;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/*A string containing only parentheses is balanced if the following is true:
1. if it is an empty string
2. if A and B are correct, AB is correct,
3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
*/



public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //create Deque of type Character
        Deque<Character> bracketsStack = new ArrayDeque<Character>();

        //string input
        System.out.println("Enter the bracket you want to see if it is balanced or not. ");
        String balancedBrackets = sc.nextLine();

        //need to loop through eah string
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
            //after loop, if the brackets are balanced, then the stack should be empty
        }

        //print out if it is balanced our not
        if(bracketsStack.isEmpty() ){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //close the scanner class
        sc.close();

    }


}










