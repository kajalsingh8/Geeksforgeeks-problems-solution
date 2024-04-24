//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.findMaxSum(N, M, Mat));
        }
    }
}
// } Driver Code Ends

class Solution 
{
   int findMaxSum(int N, int M, int Mat[][]) 
   {
       // code here
       int sum = 0;
       if(N<3||M<3)
       {
            return -1;
       }
       else
       {
           int maxx = 0;
           for(int i=0;i<N-2;i++)
           {
               for(int j=0;j<M-2;j++)
               {
               sum = (Mat[i][j]+Mat[i][j+1]+Mat[i][j+2])+
                              (Mat[i+1][j+1])+
                              (Mat[i+2][j]+Mat[i+2][j+1]+Mat[i+2][j+2]);
                             maxx=Math.max(maxx,sum);
               }
           }
           return maxx;
       }
       
    }    
    
};

