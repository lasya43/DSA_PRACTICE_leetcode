class Solution {
    public int trap(int[] height) {
        

        int leftmax=0;
        int rightmax=0;

        int l=0;
        int r=height.length-1;
        int total=0;
        while(l<r){

            leftmax=Math.max(leftmax,height[l]);
            rightmax=Math.max(rightmax,height[r]);


            if(leftmax<rightmax){
                  total+=leftmax-height[l];
                  l++;

            }
            else{
                total+=rightmax-height[r];
                r--;
            }
        }
              return total;
    }
}