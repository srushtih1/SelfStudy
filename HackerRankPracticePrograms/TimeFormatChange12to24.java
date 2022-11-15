Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
input - 07:05:45PM
output - 19:05:45
------------------------------------------

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    
        char[] newtime= new char[10];
        String st2= new String();
        String st3= new String();
        int size=s.length();
        for(int i=0;i<size-2;i++) {
            newtime[i]=s.charAt(i);
            st3+=s.charAt(i);
        }
        if(s.charAt(8)=='P') {
            
      int charPos1=Integer.parseInt(String.valueOf(newtime[0]));
      int charPos2=Integer.parseInt(String.valueOf(newtime[1]));
    if(charPos1==0) {
        charPos2 +=12;
        st2=charPos2+st3.substring(2, 8);
        
    }
    if(charPos1==1 & charPos2!=2) {
        charPos2=Integer.parseInt(st3.substring(0, 2));
        charPos2 +=12;
        st2=charPos2+st3.substring(2, 8);
        
    }
    if( (charPos1==1) & (charPos2==2) ) {
        st2 =st3;
    }
        
        }
        else {
            int charPos1=Integer.parseInt(String.valueOf(newtime[0]));
            int charPos2=Integer.parseInt(String.valueOf(newtime[1]));
            if(charPos1==0) {
                st2 =st3;
                
            }
            if( (charPos1==1) & (charPos2==2) ) {
                st2="00"+st3.substring(2, 8);
            }

 
        
        }
               
        return  st2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
