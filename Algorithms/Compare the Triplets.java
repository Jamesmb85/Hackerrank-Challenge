import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */
        int aliceScore = 0;
        int bobScore = 0;
        
        int aliceArrayScore[] = {a0, a1, a2}; //declaration, instantiation and initialization 
        int bobArrayScore[] = {b0, b1, b2}; //declaration, instantiation and initialization 
                
        //arrays are the same size so we can use either length for the loop
        for(int i = 0; i < aliceArrayScore.length; i++){
            if(aliceArrayScore[i] > bobArrayScore[i]){
                aliceScore += 1; //if Alice Score is greater increase her score by 1
            }
            else if (aliceArrayScore[i] < bobArrayScore[i]){
                bobScore += 1; //if Alice Score is less than increase Bob's score by 1
            }
            
            else{
                //nobody receives a point if they are equal
            }
        }
        
        //declaration, instantiation and initialization an array of int variables above
        int resultArray[] = {aliceScore, bobScore};
        
        //return array of scores above
        return resultArray;
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
