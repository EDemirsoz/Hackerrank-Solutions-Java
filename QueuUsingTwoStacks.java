import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackIn = new Stack<>();
        Stack<Integer> stackOut = new Stack<>();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            int option = sc.nextInt();
            
            if(option == 1){
                stackIn.push(sc.nextInt());
            } else{
                if(stackOut.isEmpty()){
                    while(!stackIn.isEmpty()){
                        stackOut.push(stackIn.pop());
                    }
                }
                if (option == 2){
                    stackOut.pop();
                } else if (option == 3){
                   System.out.println(stackOut.peek());
                }        
            }
        }
        
        sc.close();
    }
}
