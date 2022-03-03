class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int top=0, right=n-1;
        int left = 0, down = n-1;
        
        int val=0; int dir=0; // >0 , v1 , <2 , ^3
        
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i=left; i<=right; i++)
                {
                    matrix[top][i]=++val;
                }
                top++;
            }
            
            if(dir==1)
            {
                for(int i=top; i<=down; i++)
                {
                    matrix[i][right] = ++val;
                }
                right--;
            }
            
            if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    matrix[down][i] = ++val;
                }
                down--;
            }
            
            if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    matrix[i][left] = ++val;
                }
                left++;
            }
            
            dir = (dir+1)%4;
        }
        
        return matrix;
    }
}