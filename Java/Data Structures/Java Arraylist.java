package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Not my solution, but my comments about what the code is doing

public class Main {

    public static void main(String[] args) {
        // write your code here
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner in = new Scanner(System.in);
        // Numerical data input
		int n = in.nextInt();
        
		//declaring ArrayList called rows of type Integer. Initial size is unknown 
		ArrayList<ArrayList<Integer>> rows = new ArrayList();

        for (int i = 0; i < n; i++) {
			// Numerical data input
            int d = in.nextInt();
			//declaring ArrayList called row of type Integer
            ArrayList<Integer> row = new ArrayList();

            for (int j = 0; j < d; j++) {
				//call add method and add Numerical data input
                row.add(in.nextInt());
            }
			
			//after inner loop, add ArrayList row to ArrayList rows
            rows.add(row);
        }
		
		// Numerical data input
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
			// Numerical data input
            int x = in.nextInt();
            int y = in.nextInt();
			
			//exception handling
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}
