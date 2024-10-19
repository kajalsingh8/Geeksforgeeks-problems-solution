//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static String reverse(String s)
    {
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    String roundToNearest(String str) {
        // Complete the function
        String ans="";
        if(str.charAt(str.length()-1)=='0')
        {
            return str;
        }
        if(str.charAt(str.length()-1)=='1' || str.charAt(str.length()-1)=='2' || str.charAt(str.length()-1)=='3' || str.charAt(str.length()-1)=='4' || str.charAt(str.length()-1)=='5')
        {
            for(int i=0; i<str.length()-1;i++)
            {
                ans=ans+str.charAt(i);
            }
            ans=ans+'0';
            return ans;
        }
        else
        {
            
            int i=str.length()-1;
            if(str.charAt(i)!='9')
            {
                ans=ans+'0';
                i--;
                while(str.charAt(i)=='9')
                {
                    ans=ans+'0';
                    i--;
                }
                int b=Integer.parseInt(String.valueOf(str.charAt(i)))+1;
                ans=ans+String.valueOf(b);
                i--;
                 while(i>=0)
                {
                    ans=ans+str.charAt(i);
                    i--;
                }
                return reverse(ans);
            }
            i=str.length()-1;
            while(str.charAt(i)=='9')
            {
                if(i==0 && str.charAt(i)=='9')
                {
                    ans=ans+'0';
                    ans=ans+'1';
                    return reverse(ans);
                }
                ans=ans+'0';
                i--;
                
            }
            int a=Integer.parseInt(String.valueOf(str.charAt(i)))+1;
            ans=ans+String.valueOf(a);
            i--;
            while(i>=0)
            {
                ans=ans+str.charAt(i);
                i--;
            }
        }
        return reverse(ans);
    }
    
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends