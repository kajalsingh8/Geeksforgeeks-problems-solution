//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java



class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        int n = arr.length;
        int cnt = 0;
        int sum = 0;
        
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // to handle cases when the subarray starts from index 0
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            // If (sum - tar) exists in the map, it means there's a subarray
            // that sums up to the target
            if (map.containsKey(sum - tar)) {
                cnt += map.get(sum - tar);
            }
            
            // Update the map with the current cumulative sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return cnt;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int tar = Integer.parseInt(br.readLine());
            Solution obj = new Solution();
            int res = obj.subArraySum(arr, tar);

            System.out.println(res);
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends