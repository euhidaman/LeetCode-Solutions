class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int[] ans = new int[queries.length];
         
        for(int i=0;i<queries.length;i++)
        {
            int count = 0;
            int radius = queries[i][2] * queries[i][2];
            
            for(int p=0; p<points.length;p++)
            {
                
                int x = points[p][0] - queries[i][0];
                int y = points[p][1] - queries[i][1];
                
                if(x*x + y*y <= radius)
                {
                    ++count;
                }
            }
            ans[i] = count;
        }
        
        return ans;
    }    
}