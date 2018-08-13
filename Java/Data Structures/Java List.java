package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        System.out.println("Enter the number of elements in the List: ");

        // Numerical data input
        int number_of_elements_in_list = sc.nextInt();

        //ArrayList is a class that implements the List interface
        //declaring ArrayList with initial size number_of_elements_in_list
        ArrayList<Integer> sample = new ArrayList<Integer>();


        System.out.println("Fill in the list: ");

        //fill in arraylist
        for(int i = 0; i < number_of_elements_in_list; i++){
            System.out.println("Entering integer into the arraylist: ");
            // Numerical data input
            int number = sc.nextInt();
            //call the add method from the ArrayList Class
            sample.add(number);
        }

        //number of queries
        System.out.println("Enter the number of queries ");
        // Numerical data input
        int queries = sc.nextInt();

        //perfrom insert or delete until you reach the number of querioes
        for(int i = 0; i < queries; i++){
            //use if statement read in text
            System.out.println("Enter Insert or Delete. The case matters for this problem: ");
            //next() function returns the next token/word in the input as a string
            String option = sc.next();

            if(option.equals("Insert")){
                System.out.println("Enter in two numbers. The first in the index position and the second is the number you want to enter: ");
                // Numerical data input
                int x = sc.nextInt();
                int y = sc.nextInt();
                //call the add method from the ArrayList Class
                sample.add(x,y);
            }
            else if(option.equals("Delete")){
                //call remove method
                System.out.println("Enter the index you want to remove");
                // Numerical data input
                int x = sc.nextInt();
                //call the remove method from the ArrayList Class
                sample.remove(x);
            }

            else{
                //break out of loop
                break;
            }

        }

        //print out ArrayList
        for(int i = 0; i < sample.size(); i++){
            //call the get method from the ArrayList Class
            System.out.print(sample.get(i) + " ");
        }


        //close scanner class
        sc.close();


    }


}






