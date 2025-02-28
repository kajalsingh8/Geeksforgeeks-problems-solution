//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        int x,y,n=arr.length;
        for(String op:arr){
            switch(op){
                case "+": y=st.pop();
                          x=st.pop();
                          st.push(x+y);
                          break;
                    
                case "-": y=st.pop();
                          x=st.pop();
                          st.push(x-y);
                          break;
                    
                case "*": y=st.pop();
                          x=st.pop();
                          st.push(x*y);
                          break;
                    
                case "/": y=st.pop();
                          x=st.pop();
                          st.push(x/y);
                          break;
                
                default: st.push(Integer.parseInt(op));
                         break;
            }
        }
        return st.peek();

    }
}








//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        while (t-- > 0) {
            line = reader.readLine();
            String[] arr = line.split(" ");
            Solution solution = new Solution();
            System.out.println(solution.evaluate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends