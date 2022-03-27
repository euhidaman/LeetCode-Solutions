class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
       
        int i=0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for(i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
                res.add(i+1);
        }
        
        return res;
    }
}