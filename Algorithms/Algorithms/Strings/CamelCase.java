import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {

        /*Looking at the problem, all of the characters in the first word are lowercase.
        So, if we iterate thorugh the string and count all of the uppercase letters, we
        just add one and that will give us the number of words. 
        For example: s = "oneTwoThree" has three words.*/
        
        int words = 0;
        
        //iterate through the string
        for(int i = 0; i < s.length(); i++){
            //check to see if letter is uppercase
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                /*The Java String charAt() method returns the character at the specified index. 
				The index value should lie between 0 and length()-1.*/
                words++; //increase variable by 1
            }
        }
        
        //after loop return words +1
        return words+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
