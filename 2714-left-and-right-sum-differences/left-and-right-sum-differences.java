import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int leftsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }
          int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];

            ans[i]=Math.abs(leftsum-rightsum);
            leftsum=leftsum+nums[i];
        }
        return ans;
    }
}