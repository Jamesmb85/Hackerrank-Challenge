import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
      
        int apples_near_house = 0;
        int oranges_near_house  = 0;

        
        //check to see how many apples are within the starting and ending point of house. loop through array
        for(int k = 0; k < apples.length; k++){
            if( (a + apples[k] >=s ) && (a + apples[k]) <= t  ) {
                apples_near_house++; //increase variable by 1
            }
        }
        
        for(int p = 0; p < oranges.length; p++){
            if( (b+ oranges[p] >=s) && (b+ oranges[p] <=t) ){
                oranges_near_house++; //increase variable by 1
            }
        }
        
        System.out.println(apples_near_house);
        System.out.println(oranges_near_house);      

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apple = new int[m];

        String[] appleItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int appleItem = Integer.parseInt(appleItems[i]);
            apple[i] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangeItem = Integer.parseInt(orangeItems[i]);
            orange[i] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);

        scanner.close();
    }
}
