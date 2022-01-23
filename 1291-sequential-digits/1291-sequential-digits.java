class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        ArrayList<Integer> res = new ArrayList<>();
        int num = 0, base=0, delta=0;
        while(num<=high)
        {
            if(num>=low)
            {
                res.add(num);
            }
            
            num+=delta;
            
            if(num%10 == 0)
            {
                base = (base*10)+(base%10+1);
                delta = (delta*10)+1;
                num = base;
            }
        }
        return res;
    }
}