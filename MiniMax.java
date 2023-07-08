import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Integer minValue = arr.get(0);
    Integer maxValue = arr.get(0);
    Long sum = 0l;
    
    for(int i = 0; i < arr.size(); i++){
        int currValue = arr.get(i);
        
        minValue = currValue < minValue ? currValue : minValue;
        maxValue = currValue > maxValue ? currValue : maxValue;
        sum += currValue;
    }
    
    System.out.println(String.format("%s %s", sum-maxValue, sum-minValue));
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
