//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int n = s1.length(), m = s2.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int i = n-1,j = m-1;
        while(i>=0 || j >= 0 || carry != 0){
            int a = (i>=0) ? s1.charAt(i--)-'0':0;
            int b = (j>=0) ? s2.charAt(j--)-'0':0;
            int sum = a + b + carry;
            res.append(sum%2);
            carry = sum/2;
        }
        
        String output = res.reverse().toString();
        return output.replaceFirst("^0+(?!$)","");
    }
}