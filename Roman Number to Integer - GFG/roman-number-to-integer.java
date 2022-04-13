// { Driver Code Starts
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
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        
        int[] nums = new int[str.length()];
        
        for(int i=0; i<nums.length; i++)
        {
            switch( str.charAt(i) )
            {
                case 'I' : nums[i] = 1; break;
                case 'V' : nums[i] = 5; break;
                case 'X' : nums[i] = 10; break;
                case 'L' : nums[i] = 50; break;
                case 'C' : nums[i] = 100; break;
                case 'D' : nums[i] = 500; break;
                case 'M' : nums[i] = 1000; break;
            }
        }
        
        int sum = 0;
        for(int i=0; i<nums.length-1; i++ )
        {
            if( nums[i] < nums[i+1] )
                sum = sum - nums[i];
            else
                sum = sum + nums[i];
        }
        
        return sum + nums[nums.length-1];
        
    }
}