import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int numOfPostive = 0;
    int numOfNegative = 0;
    int numOfZero = 0;
    int totalNumOfElement = arr.size();
    
    for(Integer element : arr){
        if(element > 0){
            numOfPostive++;
        } else if (element == 0){
            numOfZero++;
        } else {
            numOfNegative++;
        }
    }
    
    DecimalFormat dFormat = new DecimalFormat("#0.000000");
    System.out.println(dFormat.format((double)numOfPostive/totalNumOfElement));
    System.out.println(dFormat.format((double)numOfNegative/totalNumOfElement));
    System.out.println(dFormat.format((double)numOfZero/totalNumOfElement));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
