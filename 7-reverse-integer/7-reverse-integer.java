class Solution {
    public int reverse(int x) {
        int num = x;
        int res = 0;
        while(num!=0)
        {
            int r = num%10;
            num/=10;
            
            if((res>Integer.MAX_VALUE/10) || (res==Integer.MAX_VALUE/10 && r>7))                          return 0;
            if((res<Integer.MIN_VALUE/10) || (res==Integer.MIN_VALUE/10 && r<-8)) 
                return 0;
            
            res = (res*10)+r;
        }
        return res;
    }
}