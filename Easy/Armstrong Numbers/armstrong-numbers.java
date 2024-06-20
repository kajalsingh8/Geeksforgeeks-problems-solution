//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
         String result;
         int temp,sum;
         result = "true";
         temp = n;
         sum = 0;
         for(int i = 0; i < 3; i++){
             sum += (int)Math.pow(temp%10,3);
             temp /= 10;
         }

         if(sum != n)
              result = "false";
         return result;
    }
}
