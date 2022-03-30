// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        
        if(n==1 && arr[0]==1)
            return 0;
        
        int count = 0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] < arr[i+1])
                return (i+1);
                
            if(arr[i]==1)
                ++count;
        }
        
        if(arr[n-1]==1 && count==n-1)
            return 0;
        
        return -1;
    }
}