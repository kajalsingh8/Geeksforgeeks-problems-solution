//{ Driver Code Starts
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String token : tokens) {
                nums.add(Integer.parseInt(token));
            }

            Solution solution = new Solution();
            System.out.println(solution.pairWithMaxSum(nums));
        }

        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
  int sum=0,maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++)
        {
            sum = arr.get(i)+arr.get(i+1);
            maxi = Math.max(sum,maxi);
        }
        return maxi;
    }
}