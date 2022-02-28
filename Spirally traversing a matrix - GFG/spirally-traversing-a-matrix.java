// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int[][] mat, int row, int col)
    {
        int r=0,c=0;
        int dir=0; // >0 , v1, <2 , ^3

        int top=0, down=row-1, left=0, right=col-1;
        ArrayList<Integer> res = new ArrayList<>();

        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for (int i = left; i <= right; i++) {
                    res.add(mat[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top; i<=down; i++)
                {
                    res.add(mat[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    res.add(mat[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    res.add(mat[i][left]);
                }
                left++;
            }

            dir = (dir+1)%4;
        }

        return res;
    }
}
