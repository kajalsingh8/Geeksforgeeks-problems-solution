//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(in.readLine());

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(n);
            for (int i = 0; i < ans.size(); i++) out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> al = new ArrayList<>();
        long x = n;
        al.add(x);
        while(x != 1)
        {
            if(x%2 == 0)
            {
                x = (long)Math.pow(x,0.5);
            }
            else
            {
                x = (long)Math.pow(x,1.5);
            }
            
            al.add(x);
        }
        
        return al;
    }
}
