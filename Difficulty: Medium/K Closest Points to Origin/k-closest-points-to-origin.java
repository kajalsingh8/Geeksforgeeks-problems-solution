//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends


class Solution {
    class Pair implements Comparable <Pair>{
        int x;
        int y;
        int dist;
        Pair(int x, int y, int dist)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        @Override
        public int compareTo(Pair p2)
        {
           return this.dist - p2.dist;   
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        int[][] ans = new int[k][2];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<points.length; i++)
        {
            int x = points[i][0];
            int y = points[i][1];
            int dist = (x*x) + (y*y);
            
            pq.offer(new Pair(x, y, dist));
        }
        
        while(k > 0)
        {
            k--;
            Pair curr = pq.poll();
            ans[k][0] = curr.x;
            ans[k][1] = curr.y;
        }
        return ans;
    }
}














//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] points = new int[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = scanner.nextInt();
                points[i][1] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int[][] ans = solution.kClosest(points, k);

            Arrays.sort(ans, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });
            for (int[] point : ans) {
                System.out.println(point[0] + " " + point[1]);
            }
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends