import java.io.*;
class Solution {
    public int maxArea(int[] height) {


       int i=0;
       int j=height.length-1;
       
       int left=0;
       int val=0;
       int max=0;
       int ans=0;
       while(i<j){

         left=Math.min(height[i],height[j]);
         val=j-i;
         ans=left*val;
        max=Math.max(max,ans);
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }

       } 
       return max;
    }
}