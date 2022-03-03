class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res= new ArrayList<>();
        
        int left=0, right=matrix[0].length-1;
        int top=0, down=matrix.length-1;
        
        int dir=0; // >0 , 1v , 2< , 3^
        
        int r=0, col=0;
        while(top<=down && left<=right)
        {
            // move left to right
            if(dir==0)
            {
                for(int i=left; i<=right; i++)
                {
                    res.add(matrix[top][i]);
                }
                top++;
            }
            
            // move top to down
            if(dir==1)
            {
                for(int i=top; i<=down; i++)
                {
                    res.add(matrix[i][right]);
                }
                right--;
            }
            
            // move right to left
            if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    res.add(matrix[down][i]);
                }
                down--;
            }
            
            // move down to top
            if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    res.add(matrix[i][left]);
                }
                left++;
            }
            
            // change direction
            dir = (dir+1)%4;
        }
        
        return res;
        
    }
}