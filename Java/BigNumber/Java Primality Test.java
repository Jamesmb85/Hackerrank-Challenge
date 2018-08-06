import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
		// To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner n = new Scanner(System.in);
        
        //assign value to BigInterger instance
		//next() function returns the next token/word in the input as a string 
        BigInteger b1 = new BigInteger(n.next());
        
		/* isProbablePrime(int certainty): A method in BigInteger class to check if a given number is prime. 
		For certainty = 1, it return true if BigInteger is prime and false if BigInteger is composite.*/
        if(b1.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        scanner.close();
    }
}
