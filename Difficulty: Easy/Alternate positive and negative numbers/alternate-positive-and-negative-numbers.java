//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for( int num : arr){
            if(num >=0 ){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        
        int posIdx = 0,negIdx = 0, i =0;
        while(posIdx < pos.size() && negIdx < neg.size()) {
            arr.set(i++, pos.get(posIdx++));
            arr.set(i++,neg.get(negIdx++));
        }
        while(posIdx < pos.size()){
            arr.set(i++,pos.get(posIdx++));
        }
        while(negIdx < neg.size()){
            arr.set(i++,neg.get(negIdx++));
        }
    }
}