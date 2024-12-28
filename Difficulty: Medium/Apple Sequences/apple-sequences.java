//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        
out.println("~");
}
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        int curr = 0, prev = 0;
        int count = 0;
        int ans = 0;
        while(curr < n)
        {
           if(arr.charAt(curr) == 'A')
           {
               ans = Math.max(ans, (curr-prev) + 1);
           }
           else if(arr.charAt(curr) == 'O' && count < m)
           {
               ans = Math.max(ans, (curr-prev)+1);
               count++;
           }
           else
           {
               while(arr.charAt(prev) == 'A')
               {
                   prev++;
               }
               prev++;
           }
           curr++;
        }
        return ans;
    }
}



//{ Driver Code Starts.

// } Driver Code Ends