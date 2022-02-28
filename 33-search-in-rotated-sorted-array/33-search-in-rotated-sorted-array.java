class Solution {
    
    public int search(int[] arr, int key) {
        
        // when only 1 element is present in array
        if(arr.length == 1 && arr[0]==key)
            return 0;
        else if(arr.length == 1 && arr[0]!=key)
            return -1;
        
        // for more than 1 element in array
        int left=0, right=arr.length-1;
        
        int ind=0;
        while(ind!=right && arr[ind]<arr[ind+1])
        {
            ind++;
        }
        
        int leftFound = bSearch(arr, key, left, ind);
        
        if(leftFound != -1)
            return leftFound;
        else
            return bSearch(arr, key, ind+1, right);
    }
    
    public int bSearch(int[] arr, int key, int left, int right)
    {
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    
}