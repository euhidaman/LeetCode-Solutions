class Solution {
    public int addDigits(int num) {
        int digits = (int)Math.log10(num)+1;
        
        if(digits==1)
            return num;
        
        int sum=0;
        while(digits>1)
        {
            sum = 0;
            while(num!=0)
            {
                sum += (num%10);
                num/=10;
            }
            
            digits = (int)Math.log10(sum)+1;
            if(digits>1)
                num = sum;
        }
        
        return sum;
    }
}