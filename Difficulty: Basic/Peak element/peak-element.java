//{ Driver Code Starts
import java.util.*;
import java.io.*;
class PeakElement{
	public static void main(String[] args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(in.readLine().trim());
			int[] a=new int[n];
		    int[] tmp=new int[n];
		    String s[]=in.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(s[i]);
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    out.println(f);
			}
		}
		out.close();
	}
}
// } Driver Code Ends


/*Complete the function below*/




class Solution {
    // Function to check if there is a peak element
    // arr[]: input array
    // n: size of array arr[]
    public int peakElement(int[] arr, int n) {
        // Check if the array is empty
       if (n == 0) {
            return -1; // Edge case: empty array
        }

        if (n == 1 || arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        return -1; // Should never reach here if input is valid
     // No peak element found
    }
}















// class Solution
// {
// 	// Function to find the peak element
// 	// arr[]: input array
// 	// n: size of array a[]
// 	public int peakElement(int[] arr,int n)
//     {
//       //add code here.
//       int peakEle=0;
//         if(n==1){
//             peakEle=1;
//         }
        
//         else if(arr[0]>=arr[1]){
//             peakEle=1;
//         }
        
//         else if(arr[n-1]>=arr[n-2]){
//           peakEle=1;
//         }
        
//         else{
//         for(int i=1;i<=n-2;i++){
//             if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
//               peakEle=1;
//               break;
//             }
//         }
//         }
//       return peakEle;
       
//     }
// }