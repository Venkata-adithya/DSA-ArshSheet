class Solution {
    public int findDuplicate(int[] nums) {

     /*  Find the Duplicate Number
         
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.*/
  
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num))
                return num;
        }
        return -1;
        // int n=nums.length;
        // int count=0;
        // for(int i=1;i<n;i++){
        //     count=0;
        //     for(int j=0;j<n;j++){                         //it exceeds time limit
        //         if(i==nums[j]){
        //             count++;
        //         }
        //         if(count>1){
        //             return nums[j];
        //         }
        //     }
        // }
        // return -1;
    }
}
