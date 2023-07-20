class Solution {
    public void sortColors(int[] nums) {
/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function. */

      /* in this program we are using dutch national flag algorithm */
      
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        // int n=nums.length;
        // int temp=0;
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<n-i;j++){                                     //using bubble sort
        //         if(nums[j]<nums[j-1]){
        //             temp=nums[j];
        //             nums[j]=nums[j-1];
        //             nums[j-1]=temp;
        //         }
        //     }
        // }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
