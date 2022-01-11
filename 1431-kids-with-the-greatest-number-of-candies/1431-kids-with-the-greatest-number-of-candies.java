class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> res=new ArrayList<Boolean>();
        
        for(int i=0; i<candies.length; i++)
        {
            boolean greater = false;
            for(int j=0; j<candies.length; j++)
            {
                if(candies[i]+extraCandies < candies[j])
                {
                    greater = false;
                    break;
                }
                else
                {
                    greater = true;
                }
            }
           res.add(greater); 
        }
        
        return res;
    }
}