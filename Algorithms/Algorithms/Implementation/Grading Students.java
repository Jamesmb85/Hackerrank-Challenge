import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        
        //need to iterate through array and check each grade to a set of rules
        //Rule #1 Any grade less than 40 is failing and no scale
        //Rule #2 All grades are from 0 to 100 inclusive
        //Rule #3 if difference between grade and the next higher multiple of 5 is less than 3, than round up to that multiple of 5
        //
        int number_of_students = grades.length;
        
        for(int i = 0; i < number_of_students; i++){
            //check for a failing grade
            if(grades[i] < 40){
                //check distance between 40 and grade is less than 3
                if(40 - grades[i] < 3){
                    //round up  to 40
                    grades[i] = 40;
                }
                else{
                    //do nothing and continue to the next element
                    continue;
                }
            }
            else if(grades[i] >= 40 && grades[i]%5 > 2){
               /*  grades[i]%5 > 2 is checking grade to see if remainder is greater than 2. 
				This means we can round it up to the next multiple of 5.
                For example if grade is 78, we get 78 + (5 - 78%5) which is 78+(5-3) = 80
                Second example is 80. We get 80 + (5-80%5) which is 80+(5-0) */
                 grades[i] = grades[i] + (5-grades[i]%5);  
            }
        }
        
        return grades;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
