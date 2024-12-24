//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            // Read input array as a string, split by space, and convert to integers
            String[] str = br.readLine().trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Print the result from maxLen function
            System.out.println(new Solution().maxLen(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
            if (Sum == 0) {
                maxlen = i + 1; 
            }
            if (map.containsKey(Sum)) {
                maxlen = Math.max(maxlen, i -map.get(Sum));
            } else {
                map.put(Sum, i);
            }
        }

        return maxlen;
    }
}