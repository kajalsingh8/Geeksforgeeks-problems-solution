//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
        // Create a LinkedHashSet to maintain the order of characters
        Set<Character> charSet = new LinkedHashSet<>();
        
        // Loop through the input string and add characters to the set
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }
        
        // Construct the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        
        return result.toString();
    }
}
