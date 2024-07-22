//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
   
        String s[]=S.split("\\.");
        int n=s.length;
        int l=0;
        int r=n-1;
        while(l<r){
            swap(s,l,r);
            l++;
            r--;
        }
        
        return String.join(".", s);

        
        
    }
    
    private static void swap(String s[],int l,int r){
        String temp=s[l];
        s[l]=s[r];
        s[r]=temp;
    }
}
    