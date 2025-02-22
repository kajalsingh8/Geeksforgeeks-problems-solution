//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int maxLength(String s) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
                
                if (!st.isEmpty()) {
                    res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        
        return res;
    }
}
