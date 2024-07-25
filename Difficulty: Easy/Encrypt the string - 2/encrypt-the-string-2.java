//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        // code here
           long count=1;
        String str = "";
        
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)==S.charAt(i+1)){
                count++;
            }
            else{
                str = Long.toHexString(count)+S.charAt(i)+str;
                count=1;
            }
        }
        str = Long.toHexString(count)+S.charAt(S.length()-1)+str;
        
        return str;
    }
}