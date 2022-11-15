Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example - arr[1,3,5,7,9]

The minimum sum is 1+3+5+7+9 =16 and 
the maximum sum is 3+5+7+9 = 24. 
The function prints 16 24


----------------------------------------
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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        
        arr.sort(Comparator.naturalOrder());
        long sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);           
        }
    
        //Sorting the array and storing the minimum and maximum values
        int min=arr.get(4);
        int max=arr.get(0);
        long minSum = sum-min;
        long maxSum = sum-max;
        System.out.println(minSum+" "+maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

