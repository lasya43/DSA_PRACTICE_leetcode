class NumArray {
     
     int[] psa;
    public NumArray(int[] nums) {
      
         psa=new int[nums.length];
          psa[0]=nums[0];
         for(int i=1;i<nums.length;i++){
           psa[i]=psa[i-1]+nums[i];
         }
    }
    
    public int sumRange(int left, int right) {
        
        
        if(left==0){
            return psa[right];
        }
       return psa[right]-psa[left-1];
    }
}



/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */