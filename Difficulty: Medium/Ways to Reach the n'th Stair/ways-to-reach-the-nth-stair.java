//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method countWays() of class
            // DynamicProgramming
            System.out.println(obj.countWays(m));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to count number of ways to reach the nth stair.
    int countWays(int n) {

        // your code here
        int[] ways = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        if(n == 1) return 1;
        for(int i = 2;i<=n;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }
}
