//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            int[][] image = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S2 = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) image[i][j] = Integer.parseInt(S2[j]);
            }
            int sr = Integer.parseInt(br.readLine().trim());
            int sc = Integer.parseInt(br.readLine().trim());
            int newColor = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n=image.length;//row
        int m=image[0].length;//col
        int [][] vis =new int [n][m];
        //System.out.println(n +" "+m);
        vis[sr][sc]=1;
        int oldColor=image[sr][sc];
        image[sr][sc]=newColor;
        
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sr,sc));
        
        while(!q.isEmpty()){
            Pair p= q.poll();
            int x=p.first;
            int y=p.second;
            image[x][y]=newColor;
            int dx[]={-1,0,0,1};
            int dy[]={0,-1,1,0};
            for(int k=0;k<4;k++){
                int nx=dx[k]+x;
                int ny=dy[k]+y;
                if(nx>=0 && nx<n && ny>=0 && ny<m && vis[nx][ny]==0 && image[nx][ny]==oldColor){
                    vis[nx][ny]=1;
                    q.add(new Pair(nx,ny));
                }
            }
            
        }
        
        return image;
        
    }
}