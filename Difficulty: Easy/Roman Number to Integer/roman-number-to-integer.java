//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        
      Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Step 2: Initialize the result
        int result = 0;

        // Step 3: Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Get the value of the current character
            int current = romanMap.get(str.charAt(i));
            
            // Check if this is the last character or if the current value is greater than or equal to the next value
            if (i == str.length() - 1 || current >= romanMap.get(str.charAt(i + 1))) {
                result += current; // Add the current value to the result
            } else {
                result -= current; // Subtract the current value from the result
            }
        }

        return result; // Return the final result
    }
  
    }
    