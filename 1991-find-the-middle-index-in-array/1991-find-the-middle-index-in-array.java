class Solution {
    public int findMiddleIndex(int[] nums) {
        
      int leftsum=0;
      int total=0;
      for(int i=0;i<nums.length;i++){
        total=total+nums[i];
      }

     for(int i=0;i<nums.length;i++){
        int right=total-leftsum-nums[i];
        if(leftsum==right){
            return i;
        }
        leftsum=leftsum+nums[i];
     
}
return -1;
    }
}