//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> s = new Stack<>();
        char[]arr = S.toCharArray();
        int max =0;
        for(int i =0;i<arr.length;i++){
            if(!s.isEmpty() && arr[s.peek()]== '(' && arr[i]==')')s.pop();
            else s.push(i);
            int curr = (s.isEmpty()) ? i+1:i-s.peek();
            max = Math.max(curr,max);
        }
        return max;
    }
}