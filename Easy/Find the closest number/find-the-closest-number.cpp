//{ Driver Code Starts
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
    public:
    int findClosest( int n, int k,int arr[]) 
    { 
        int r = lower_bound(arr,arr+n,k)-arr;
        int l = r-1;
        if(l < 0){
            return arr[r];
        }
        else{
            int diff1 = abs(k-arr[r]);
            int diff2 = abs(k-arr[l]);
            if(diff1 <= diff2){
                return arr[r];
            }
            return arr[l];
        }
    } 
};








//{ Driver Code Starts.
int main()
{

    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        int arr[n];
        for (int i=0; i<n; i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        cout<<ob.findClosest(n,k,arr)<<endl;
    }
}

// } Driver Code Ends