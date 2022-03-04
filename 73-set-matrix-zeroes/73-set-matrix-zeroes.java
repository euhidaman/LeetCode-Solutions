class Solution {
    public void setZeroes(int[][] matrix) {
        
        // check if first row has any zeroes
        boolean trZero=false;
        for(int i=0; i<matrix[0].length; i++)
        {
            if(matrix[0][i]==0)
            {
                trZero=true;
                break;
            }
        }

        // check if first column has any zeroes
        boolean tcZero=false;
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0]==0)
            {
                tcZero=true;
                break;
            }
        }

        // set first row element, and first column element as zero starting from 1,1 co-ord of matrix
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        // update the matrix elements to 0, whenever 0 is found in first row and col
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }

        // if 0 is present in first row, make entire row as 0
        if(trZero)
        {
            for(int i=0; i<matrix[0].length; i++)
            {
                matrix[0][i]=0;
            }
        }

        // if 0 is present in first col, make entire col as 0
        if(tcZero)
        {
            for(int i=0; i<matrix.length; i++)
            {
                matrix[i][0]=0;
            }
        }
        
    }
}