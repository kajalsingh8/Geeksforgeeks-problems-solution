//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends



class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Create a HashMap to store the counts of elements in a1
        HashMap<Long, Integer> map = new HashMap<>();
        
        // Populate the map with the counts of elements in a1
        for (long num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Check if each element in a2 can be found in the map with a count greater than 0
        for (long num : a2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return "No";
            }
            // Decrement the count of the current element in the map
            map.put(num, map.get(num) - 1);
        }
        
        // If all elements in a2 are found in the map, return "Yes"
        return "Yes";
    }
}
