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
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
 class Solution {

    static int f(int n,int dp[])

    {

        if(n<2)

        return n;

        if(dp[n]!=-1)

        return dp[n];

        return dp[n]=(f(n-1,dp)+f(n-2,dp))%1000000007;

    }

    static int firstElement(int n) 

    {

        int dp[]=new int[n+1];

        Arrays.fill(dp,-1);

        return f(n,dp);

        // code here

    }

}