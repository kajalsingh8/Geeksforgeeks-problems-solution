//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxPartitions(String s) {
        // code here
        HashMap <Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }
        
      
        int end =0;
        int count =0;
        
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, map.get(s.charAt(i)));

            if (i == end) {
                count++;
                
            }
        }
        
        return count;
    }
}

