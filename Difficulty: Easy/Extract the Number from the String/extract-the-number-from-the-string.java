//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long res=-1;
        String arr[]=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            if(curr.contains("9")){
                continue;
            }
            if(Character.isDigit(curr.charAt(0))){
                long rescurr=Long.parseLong(curr);
                res=Math.max(res,rescurr);
            }
        }
        return res;
    }
}