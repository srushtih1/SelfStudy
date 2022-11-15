//Question - 
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000

-------------------------------------------------

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        float arrCount = 0;
        
        for (int number : arr){
            if(number > 0){
                positiveCount++;
            }else if(number < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
            arrCount++;
        }
        
        
        Float positiveRatioFloat = new Float(positiveCount/arrCount);
        Float negativeRatioFloat = new Float(negativeCount/arrCount); 
        Float zeroRatioFloat = new Float(zeroCount/arrCount);  
        
        System.out.println(String.format("%.6f", positiveRatioFloat));
        System.out.println(String.format("%.6f", negativeRatioFloat));
        System.out.println(String.format("%.6f", zeroRatioFloat));
        
        //System.out.println("%1.4f" +positiveRatioFloat);
        //System.out.println("%1.4f" +negativeRatioFloat);  
        //System.out.println("%1.4f" +zeroRatioFloat); 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
