//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int w;
            w = Integer.parseInt(br.readLine());

            int[] cost = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimumCost(n, w, cost);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int minimumCost(int n, int w, int[] cost) {
        int[] prev = new int[w + 1];
        int[] curr = new int[w + 1];
        Arrays.fill(prev, (int) 1e8);
        Arrays.fill(curr, (int) 1e8);
        prev[0] = curr[0] = 0;

        for (int i = 1; i <= n; i++) {
            curr[0] = 0;
            for (int k = 0; k <= w; k++) {
                int nontake = prev[k];
                int take = (int) 1e8;
                if (cost[i - 1] != -1 && i <= k) {
                    take = cost[i - 1] + curr[k - i];
                }
                curr[k] = Math.min(take, nontake);
            }
            prev = Arrays.copyOf(curr, curr.length);
        }
        if (prev[w] == (int) 1e8) return -1;
        return prev[w];
    }
}