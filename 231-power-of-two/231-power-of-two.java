class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        int num = 0;
        while(n!=0)
        {
            int r = n%2;
            n/=2;
            if(r==1)
                count++;
        }
        
        if(count == 1)
            return true;
        return false;
    }
}