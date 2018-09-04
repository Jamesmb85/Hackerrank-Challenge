/* Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth(B) and height(H). 

You should read the variables from the standard input.

If B<=0 or H<= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
//Write your code here

/* When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level. 
Static variables are, essentially, global variables. All instances of the class share the same static variable. */

//static variables
static int B;
static int H;
static boolean flag;

/* This code inside static block is executed only once: the first time you make an object of that class or the first time 
you access a static member of that class (even if you never make an object of that class). */ 

// start of static block 
static{
    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    Scanner sc = new Scanner(System.in);
	//numerical data input
    int B = sc.nextInt();
    int H = sc.nextInt();
    
    if(B <=0 || H <= 0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else{
        System.out.println(B*H);
    }
  }// end of static block
  
  public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

