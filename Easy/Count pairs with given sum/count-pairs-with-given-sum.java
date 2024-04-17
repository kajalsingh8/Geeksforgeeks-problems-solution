//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        //for(int y:arr) System.out.print(y+" ");
        //System.out.println();
        int[][] dp=new int[n][2];
        dp[0][0]=arr[0];
        dp[0][1]=0;
        int i=0;
        for(int x:arr){
                if(x==dp[i][0]) dp[i][1]++;
                else {
                    dp[++i][0]=x;
                    dp[i][1]++;}
        }
        
        int j=0;
        int total=0;
        while(j<=i){
            if(dp[j][0]+dp[i][0]==k && dp[j][0]!=dp[i][0]){
                total+= dp[j][1]*dp[i][1];
                //System.out.println(dp[j][0]+" "+dp[i][0]);
                i--; j++;
            }
           else if(dp[i][1]>=2 && 2*dp[i][0]==k){
               total +=dp[i][1]*(dp[i][1]-1)/2;
               i--;
           }
           else if(dp[j][0]+dp[i][0]>k){i--;}
           
           else j++;
        }
        
        return total;
    }
    
}