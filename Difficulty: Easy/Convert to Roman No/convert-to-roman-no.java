//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		
	       int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // Initialize the result as a StringBuilder for efficient concatenation
        StringBuilder result = new StringBuilder();
        
        // Iterate over the values and symbols
        for (int i = 0; i < values.length; i++) {
            // Append the symbol while the value can be subtracted from n
            while (n >= values[i]) {
                result.append(symbols[i]);
                n -= values[i];
            }
        }
        
        // Convert the StringBuilder to a String and return
        return result.toString();
	}
}