```
class Solution {
public int removeElement(int[] nums, int val) {
int i = 0;
for(int n : nums)
{
if(n != val)
{
nums[i++] = n;
}
}
return i;
}
}
```
​
This code loops through the entire array, and if the given element is not found,
then the array is modified and it holds only the elements which other than the given element.
​
*Refer the previous easy problem, because they both have almost same answer -->
[https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/](remove duplicates from sorted array)