class Solution {
    public int minPartitions(String n) {
        int max_num = Integer.MIN_VALUE;
        for(int i=0; i<n.length(); i++)
        {
            max_num = Math.max(max_num, n.charAt(i)-'0');
        }
        return max_num;
    }
}