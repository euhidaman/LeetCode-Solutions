My Recursion Code -->
```
class Solution {
public int search(int[] nums, int target) {
int left = 0;
int right = nums.length-1;
return bSearch(left, right, nums, target);
}
public int bSearch(int left, int right, int[] arr, int key)
{
if(right < left)
return -1;
int mid = left + (right-left)/2;
if(arr[mid]==key)
return mid;
if(arr[left] <= arr[mid])
{
if(arr[left]<=key && key<=arr[mid])
return bSearch(left, mid-1, arr, key);
else
return bSearch(mid+1,right, arr, key);
}
if(arr[mid]<=key && key<=arr[right])
return bSearch(mid+1, right, arr, key);
return bSearch(left, mid-1, arr, key);
}
}
```