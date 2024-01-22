class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
          //Choosing index to change its sign
            if(nums[index]<0){
                res.add(index+1);
            }
          //checking whether the sign is negative i.e if negative it is repeated
            nums[index]=nums[index]*-1;
          //changing index valued number
        }
        return res;
    }
}
