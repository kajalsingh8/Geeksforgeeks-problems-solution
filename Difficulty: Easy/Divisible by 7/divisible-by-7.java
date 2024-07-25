//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.isdivisible7(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int isdivisible7(String num){
      int sum=0;
      for(int i=0;i<num.length();i++){
          int digit=num.charAt(i)-'0';
          sum=sum*10+digit;
          sum=sum%7;
      }
      
      if(sum==0){
          return 1;
      }
      return 0;
    }
}