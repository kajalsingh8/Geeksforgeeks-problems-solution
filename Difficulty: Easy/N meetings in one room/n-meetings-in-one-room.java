//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int[][] meet = new int[n][2];
        for(int i=0; i<n; i++){
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }
        Arrays.sort(meet, Comparator.comparingInt(o -> o[1]));
        int count = 1;
        int st = meet[0][0];
        int et = meet[0][1];
        for(int i=1; i<n; i++){
            if(meet[i][0]>et){
                st = meet[i][0];
                et = meet[i][1];
                count++;
            }
        }
        return count;
    }

}