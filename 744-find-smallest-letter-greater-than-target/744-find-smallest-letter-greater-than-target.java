class Solution {
    public char nextGreatestLetter(char[] arr, char key) {
        
        int left = 0, right=arr.length-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            
            if(key<arr[mid])
            {
                right = mid-1;
            }
            else if(key>=arr[mid])
            {
                left = mid+1;
            }
        }
        
        return arr[left%arr.length];
    }
}