package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*Create a method that determine si a string is a Palindrome or not.
* Below, my method doesn't take into account spaces and characters such as question marks
 So, abcba is a palindrome, but a b c b a is not. */


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(isPalindrome("abcba")); //should return true
        System.out.println(isPalindrome("wasitacaroracatisaw")); //should return true The string with spaces is was it a car or cat i saw

    }


    public static boolean isPalindrome(String input){
        //create a deque of type characters back by an array
        Deque<Character> valuesOfString = new ArrayDeque<Character>();

        //need to iterate through the string an place each character in the stack
        for(int i = 0; i < input.length(); i++){
            //call push method and assign the value at index i
            valuesOfString.push(input.charAt(i));
        }

        /*With all characters in the deque now, we need to compare the letter at the top of the stack and with letter in the string
        * if at any point the letter aren't equal we return false. We pop the letter off if they are equal and go to the next iteration*/
        for(int j = 0; j < valuesOfString.size(); j++){
            //compare the top of the stack with the first letter in the string
            if(valuesOfString.peek() == input.charAt(j) ){
                //letter are equal so we pop the stack
                valuesOfString.pop();
            }
            else{
                //the letter aren't equal so we don't have a palindrome so we return false
                return false;
            }

        }
        /*We made it through the loop and all of the character match so we can return true*/
        return true;

    }

}










