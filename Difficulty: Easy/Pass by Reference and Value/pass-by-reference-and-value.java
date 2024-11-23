//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] passedBy(int a, int b) {
        // code here return a,b;
         int arr[]={a,b};
          arr[0]+=1;
          arr[1]+=2;
          return arr;
    }
}

