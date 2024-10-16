//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Read number of test cases

        // Loop through each test case
        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            List<Integer> arr = new ArrayList<>();

            // Convert input to list of integers
            for (String str : inputArr) {
                arr.add(Integer.parseInt(str));
            }

            Solution ob = new Solution();
            boolean ans = ob.checkSorted(arr);

            // Output result
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }

        scanner.close();
    }
}

// } Driver Code Ends


class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int j,swap=0;
        for(int i = 0;i < arr.size()-1;i++){
            j = arr.size() - 1;
            while(j > i){
                if(arr.get(i) > arr.get(j)){
                    if(swap == 2){
                        return false;
                    }
                    int temp = arr.get(j);
                    arr.set(j , arr.get(i));
                    arr.set(i , temp);
                    swap++;
                }
                j--;
            }
        }
        return true;
    }
}