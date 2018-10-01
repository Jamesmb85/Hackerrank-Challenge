package com.company;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
Input Format
The first line will have an integer, n, denoting the number of entries in the phone book.
Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'.
Each phone number has exactly 8 digits without any leading zeros.
1<=N<=1000000
1<=Query<=1000000
Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.   */



public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many entries are in the phonebook: ");
        int entries = sc.nextInt();

        //create Map with keys as Strings and values as integers
        Map<String, Integer> phonebook = new HashMap<>();

        //fill in the phonebook
        for (int i = 0; i < entries; i++) {
            System.out.println("What's the person's full name: ");
            String name = sc.next();

            //clear the input line
            sc.nextLine();

            System.out.println("What is the person phone number. Enter it with no spaces or dashes: ");
            int phoneNumber = sc.nextInt();

            //places value in phoneBook
            phonebook.put(name, phoneNumber);

            //clear the input line
            sc.nextLine();

        }

       /* //print put values in phoneBook
        for(String value: phonebook.keySet()){
            System.out.println("Name is: " + value + " and phone number is: " + phonebook.get(value));
        }*/


        //query phone book entries until you find no more keys
        for (String value : phonebook.keySet()) {
            System.out.println("Who do you want to look for in the phone book? Enter their full name: ");
            String fullName = sc.nextLine();


            // This method is used to search the specified key from this map.
            if (phonebook.containsKey(fullName)) {
                System.out.println("Name is: " + fullName + " and phone number is: " + phonebook.get(fullName));
            } else {
                System.out.println("Not found");
            }

        }

        //close the scanner class
        sc.close();
    }

}
