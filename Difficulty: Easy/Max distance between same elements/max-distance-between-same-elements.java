//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int ans = 0;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(mpp.containsKey(arr[i])){
                ans = Math.max(ans, i - mpp.get(arr[i]));
            }else{
                mpp.put(arr[i],i);
            }
        }
        return ans;
        // Code here
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends