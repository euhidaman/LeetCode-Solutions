// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            res.add(i+1);
            for(int j=i; j<n; j++)
            {
                sum+=arr[j];
                
                if(sum > s)
                    break;
                else if(sum==s)
                {
                    res.add(j+1);
                    return res;
                }
                
            }
            
            res.clear();
        }
        
        res.add(-1);
        return res;
    }
}