class Solution {
    public int subarraySum(int[] nums, int k) {
     
  HashMap<Integer,Integer>hm=new HashMap<>();
  hm.put(0,1);

  int prefix=0;
  int result=0;
  for(int num:nums){
    prefix=prefix+num;
    if(hm.containsKey(prefix-k)){
        result=result+hm.get(prefix-k);
    }
    
        hm.put(prefix,hm.getOrDefault(prefix,0)+1);
    
  }
  return result;























    // int ans=Integer.MIN_VALUE;
    // int count=0;
    //  int n=nums.length;
    //   for(int i=0;i<n;i++){
    //     int sum=0;
    //    for(int j=i;j<n;j++){
       
    //    sum=sum+nums[j];
    //    if(sum==k){
    //     count++;
    //    }

       
    //    }
    //   }
      
    //   return count;
    // }



    }
}