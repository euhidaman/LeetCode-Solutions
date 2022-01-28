class Solution {
    public int titleToNumber(String str) {
        if(str.length()==0)
            return -1;
        
        int sum = 0;
        for(char ch : str.toCharArray())
        {
            sum *= 26;
            sum += (ch-'A')+1;
        }
        
        return sum;
    }
}