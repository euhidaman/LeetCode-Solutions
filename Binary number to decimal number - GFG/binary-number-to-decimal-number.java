// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();            
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int binary_to_decimal(String str)
    {
        // Code here
        double num=Double.parseDouble(str);
        int decimal = 0, count=0;
        while(num!=0)
        {
            int r = (int)(num%10);
            num/=10;
            decimal += (r*(int)Math.pow(2,count));
            ++count;
        }
        return decimal;
    }
}