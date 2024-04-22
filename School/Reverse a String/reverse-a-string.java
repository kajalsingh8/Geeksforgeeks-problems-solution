//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(s));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String s) {
        // code here
        //initialize string
        String str = "";
        
        //Convert string to character array using toCharArray() method.
        char[] ch = s.toCharArray();
        
        int n = ch.length;
        for(int i = 0; i < n/2; i++){
            char temp = ch[i];
            ch[i] = ch[n-i-1];
            ch[n-i-1] = temp;
            
        }
        
        //Convert character into string using String.valueOf() method
        str = str + String.valueOf(ch);
        
        return str;
    }
}