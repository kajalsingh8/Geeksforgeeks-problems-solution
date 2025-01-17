//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int pro = 1, zero = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] !=0){
                pro*=arr[i];
            }else{
                zero++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(zero>1){
                arr[i] =0;
            }else if(zero == 1){
                arr[i]= arr[i]!=0?0:pro;
            }else{
                arr[i]=pro/arr[i];
            }
        }
        return arr;
    }
}
