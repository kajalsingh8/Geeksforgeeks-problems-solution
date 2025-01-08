//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    public int countTriangles(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array
        int count = 0;

        if (n < 3) {
            return 0; // If less than 3 elements, no triangle can be formed
        }

        // Iterate from the largest element towards the third element
        for (int i = n - 1; i >= 2; i--) {
            int j = 0, k = i - 1;

            while (j < k) {
                if (arr[j] + arr[k] > arr[i]) {
                    count += (k - j); // All pairs between j and k are valid
                    k--; // Move the upper pointer
                } else {
                    j++; // Move the lower pointer
                }
            }
        }
        return count; // Return the total count of triangles
    }
}
