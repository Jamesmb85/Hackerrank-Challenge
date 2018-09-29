package com.company;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of pairs in the set: ");

        int pairs = sc.nextInt();

        //create a set that takes a pair of strings Let's use the Hashset class
        Set<String> namePairs = new HashSet<String>();

       //since a set is an unordered collection of objects, all we need to do is print the size of the hashset every iteration and show duplicate objects weren't added
        for(int i = 0; i < pairs; i++){
            //read in two strings
            System.out.println("Enter the first name: ");
            String firstName = sc.next();
            System.out.println("Enter the last name: ");
            String lastName = sc.next();

            //add string to hashset
            namePairs.add(firstName + " " + lastName);


            //print out size of hahset
            System.out.println(namePairs.size());

        }


        sc.close();

    }


}










