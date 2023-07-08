/**Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

In this problem we are using two pointer algorithm equi directional that means we use two pointers starting at O and 1 positions checking zeros .

If start pointer points to 0 and end pointer to non 0 then we swap both of them

else both pointers point to 0 then increment end pointer

else increment both pointers

*/
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return;
        }
        int start=0,end=1;
        while(end<n){
            if(nums[start]==0 && nums[end]!=0){
                nums[start]=nums[end];
                nums[end]=0;
                start++;
                end++;
            }
            else if(nums[start]==0 && nums[end]==0){
                end++;
            } 
            else{
                start++;
                end++;
            }
        }
    }
}
