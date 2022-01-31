class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_money=0;
        
        for(int i=0; i<accounts.length; i++)
        {
            int sum=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                sum+=accounts[i][j];
            }
            max_money = Math.max(max_money, sum);
        }
        
        return max_money;
    }
}