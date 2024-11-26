//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        // Step 1: Find max subarray sum using Kadane's Algorithm
        int maxNormal = kadane(arr);
        
        // If all elements are negative, return maxNormal
        if (maxNormal < 0) {
            return maxNormal;
        }

        // Step 2: Calculate array sum and find min subarray sum
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
            arr[i] = -arr[i]; // Invert elements to find minimum subarray sum
        }

        int minSubarraySum = kadane(arr);
        int maxCircular = arraySum + minSubarraySum; // arraySum - (-minSubarraySum)

        // Step 3: Return the maximum of maxNormal and maxCircular
        return Math.max(maxNormal, maxCircular);
    }

    // Kadane's Algorithm to find max subarray sum
    private int kadane(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}