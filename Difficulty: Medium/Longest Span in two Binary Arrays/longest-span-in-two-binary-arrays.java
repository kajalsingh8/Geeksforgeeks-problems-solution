//{ Driver Code Starts
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().trim().split(" ");
            String[] arr2Str = sc.nextLine().trim().split(" ");
            int n = arr1Str.length;
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(arr1Str[i]);
                arr2[i] = Integer.parseInt(arr2Str[i]);
            }

            Solution sol = new Solution();
            int result = sol.longestCommonSum(arr1, arr2);
            System.out.println(result);
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends



class Solution {
    public int longestCommonSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] diff = new int[n];

        // Step 1: Compute the difference array
        for (int i = 0; i < n; i++) {
            diff[i] = arr1[i] - arr2[i];
        }

        // Step 2: Initialize variables for prefix sum and hash map
        int prefixSum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        // Step 3: Iterate through the difference array
        for (int i = 0; i < n; i++) {
            prefixSum += diff[i];

            // If prefixSum is 0, it means the span from the start to current index is valid
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If prefixSum exists in hash map, calculate the span length
            if (prefixMap.containsKey(prefixSum)) {
                int spanLength = i - prefixMap.get(prefixSum);
                maxLength = Math.max(maxLength, spanLength);
            } else {
                // Store the first occurrence of this prefixSum
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
