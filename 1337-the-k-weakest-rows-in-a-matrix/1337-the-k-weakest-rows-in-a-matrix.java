class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int[] soldiers = new int[mat.length];
        int val = 0;
        
        for(int i=0; i<mat.length; i++)
        {
            int count = 0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j]==1)
                    count++;
                else
                    break;
            }
            
            soldiers[val++] = count;
            count=0;
        }
        
        int res[] = new int[k];
        int index = 0;
        while(k-- > 0)
        {
            int minIndex = 0;
            for(int i=0; i<soldiers.length; i++)
            {
                if(soldiers[i] < soldiers[minIndex])
                    minIndex = i;
            }
            res[index++] = minIndex;
            soldiers[minIndex] = Integer.MAX_VALUE;
        }
        
        return res;
    }
}