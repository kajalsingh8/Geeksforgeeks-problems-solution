//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends


class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
      
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }


        for (int i = 0; i < arr.length; i++) {
            char[] charArray = arr[i].toCharArray();
            Arrays.sort(charArray);
            arr[i] = new String(charArray); 
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length]; // To mark visited elements

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                ArrayList<String> group = new ArrayList<>();
                group.add(arr1[i]); // Add the original word to the group
                visited[i] = true;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        group.add(arr1[j]); // Add matching original word to the group
                        visited[j] = true;
                    }
                }

                result.add(group);
            }
        }

        return result;
    }
}




//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends