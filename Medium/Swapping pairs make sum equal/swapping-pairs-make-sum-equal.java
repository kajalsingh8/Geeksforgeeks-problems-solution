//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
    
        long sum1=0,sum2=0; //store the total sum of value of arrays
        HashSet<Long> h1=new HashSet<>(); //hash set containing value of array a
        for(long i:a) {
            h1.add(i);
            sum1+=i;
        }
        HashSet<Long> h2=new HashSet<>(); //hash set containing value of array b
        for(long i:b) {
            h2.add(i);
            sum2+=i;
        }
        
        long mid=sum2+sum1; 
        if(mid%2!=0) return -1; //if the sum is odd , middle there is no middle point
        mid/=2;                            //middle point to be reached for sum to be same
        // as one array only again value what other array looses, middle point has to be reached for sum to be equal
        
        HashSet<Long> smaller=(sum1>sum2)?h2:h1;
        HashSet<Long> larger=(sum1>sum2)?h1:h2; // assigning hashset of array with highest sum to large  
        long lowerSum=(sum1>sum2)?sum2:sum1;
        
        for(long i:smaller)
            if(larger.contains(mid+i-lowerSum)) return 1; 

       //on solving the equation (wrt to array with lower sum)
      // (middlePoint - currentLowerSum) = ( -valueLostFromSumAfterSwap + valueGainedToSumAfterSwap)
     // mid - lowerSum = - i + valuePairLookingInLargerArray
     // valuePairLookingInLargerArray = mid + i - lowerSum
        
        return -1;
        
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int m = Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a, n, b, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends