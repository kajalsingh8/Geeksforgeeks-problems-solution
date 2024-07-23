//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends



// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        
        recur(n, 1, 1, ans);
        
        return ans;
    }
    
    static void recur(long n, int i, long fact, ArrayList<Long> ans){
        
        if(fact > n) return;
        
        fact = fact*i;
        
        if( fact <= n ) ans.add(fact);
        
        recur(n, i+1, fact, ans);
    }
}
