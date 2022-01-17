class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        for(int col=0; col<n; col++)
        {
            sortLogic(mat,0,col);
        }
        
        for(int row=1; row<m; row++)
        {
            sortLogic(mat,row,0);
        }
        
        return mat;
    }
    
    void sortLogic(int[][] mat, int row, int col)
    {
        int m=mat.length;
        int n=mat[0].length;

        int r=row;
        int c=col;
        List<Integer> values = new ArrayList<>();
        while(r<m && c<n)
        {
            values.add(mat[r][c]);
            r++;
            c++;
        }
        
        Collections.sort(values);
        
        r=row;
        c=col;
        
        int index = 0;
        while(r<m && c<n)
        {
            mat[r][c] = values.get(index++);
            r++;
            c++;
        }
        
    }
}