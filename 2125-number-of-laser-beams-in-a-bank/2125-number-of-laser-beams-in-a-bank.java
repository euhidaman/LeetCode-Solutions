class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0,prev=0;
        for(int i=0; i<bank.length; i++)
        {
            int count=0;
            for(int k=0; k<bank[i].length(); k++)
            {
                if(bank[i].charAt(k)=='1')
                    count++;
            }
            if(count==0)
                continue;
            sum += (prev*count);
            prev=count;
        }
        return sum;
    }
}