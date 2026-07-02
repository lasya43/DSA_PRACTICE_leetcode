class Solution {


    public static int leftMost(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                r=mid-1;
            }
           else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=arr.length){
            return -1;
        }
         if(arr[l]!=target){
            return -1;
        }
        return l;

    }


     public static int rightMost(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                l=mid+1;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(arr[r]!=target){
            return -1;
        }
        return r;
     }
    public int[] searchRange(int[] nums, int target) {
       int lm=leftMost(nums,target);
       int rm=rightMost(nums,target);
       int[] ans={lm,rm};
       return ans;
    }
}