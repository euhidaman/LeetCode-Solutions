class Solution {
    public boolean validMountainArray(int[] arr) {
        int pos=0;
        
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1]<arr[i]) //Breaking point for decreasing loop
            {
                pos=i;
                i=arr.length;
            }
            else if(arr[i]==arr[i+1])
                return false;
        }
        
        if(pos==0)
            return false;
            
        for(int i=pos+1; i<arr.length-1; i++)
        {
            if(arr[i]<=arr[i+1])
                return false;
        }
        
        return true;
    }
}