/*
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

 

Example 1:

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
 

Constraints:

2 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.
*/

class Solution {
    public int dominantIndex(int[] nums) 
    {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        if(nums[nums.length-1] < nums[nums.length-2]*2)
            return -1;

        int n = nums[nums.length-1];

        for(int i = 0; i<temp.length; i++)
        {
            if(n == temp[i])
                return i;
        }
        

        return 0;
    }
}
