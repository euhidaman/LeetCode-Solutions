class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int res[] = new int[matrix.length*matrix[0].length];

        int t=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[t++]=matrix[i][j];
            }
        }
        
        Arrays.sort(res);
        return res[k-1];
    }
}