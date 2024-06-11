//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

class Array {
  public:
    template <class T>
    static void input(vector<T> &a, int n) {
        for (int i = 0; i < n; i++) {
            scanf("%d ", &a[i]);
        }
    }

    template <class T>
    static void print(vector<T> &a) {
        for (int i = 0; i < a.size(); i++) {
            cout << a[i] << " ";
        }
        cout << endl;
    }
};


// } Driver Code Ends

class Solution {
public:
    long long maxTip(int n, int x, int y, vector<int> &arr, vector<int> &brr) {
        vector<pair<int, int>> diffs(n);
        for (int i = 0; i < n; ++i) {
            diffs[i] = {abs(arr[i] - brr[i]), i};
        }
        
        sort(diffs.rbegin(), diffs.rend());
        
        long long totalTip = 0;
        int aOrders = 0, bOrders = 0;
        
        for (int i = 0; i < n; ++i) {
            int idx = diffs[i].second;
            if ((arr[idx] >= brr[idx] && aOrders < x) || bOrders >= y) {
                totalTip += arr[idx];
                ++aOrders;
            } else {
                totalTip += brr[idx];
                ++bOrders;
            }
        }
        
        return totalTip;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        int n;
        scanf("%d", &n);

        int x;
        scanf("%d", &x);

        int y;
        scanf("%d", &y);

        vector<int> arr(n);
        Array::input(arr, n);

        vector<int> brr(n);
        Array::input(brr, n);

        Solution obj;
        long long res = obj.maxTip(n, x, y, arr, brr);

        cout << res << endl;
    }
}

// } Driver Code Ends