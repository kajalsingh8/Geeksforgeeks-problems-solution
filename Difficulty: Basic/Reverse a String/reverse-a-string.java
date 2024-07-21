//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)

    {
        
        
        char[] charStr=str.toCharArray();
        int l=0;
        int r=charStr.length-1;
        
        while(l<r){
            char temp=charStr[l];
            charStr[l]=charStr[r];
            charStr[r]=temp;
            
            l++;
            r--;
        }
        
        return new String(charStr);
        
        
        
        // // Reverse the string str
        // char l=0;
        // char r=str.length()-1;
        
        // while(l<r){
        //     char temp=str[l];
        //     str[l]=str[r];
        //     str[r]=temp;
            
        //     l++;
        //     r--;
        // }
        
        // return str;
    }
}