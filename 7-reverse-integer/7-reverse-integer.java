class Solution {
    public int reverse(int num) {
        int res = 0, newRes=0;
        while(num!=0)
        {
            int r = num%10;
            num/=10;
            
            res = (newRes*10)+r;

            if((res-r)/10 != newRes)
                return 0;
            
            newRes = res;
        }
        return res;
    }
}