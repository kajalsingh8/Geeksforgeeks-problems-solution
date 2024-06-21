//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {

    String compareFrac(String str) {
        // Code here
        String[] temp = str.split("[/,]");

        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int c = Integer.parseInt(temp[2].trim());
        int d = Integer.parseInt(temp[3]);

        int ad = a * d;
        int cb = c * b;
        
        String ans = null;
        
        if (ad > cb) {
            ans = a + "/" + b;
        } 
        else if (cb > ad) {
            ans = c + "/" + d;
        } 
        else if (ad == cb) {
            ans = "equal";
        }

        return ans;
    }
}