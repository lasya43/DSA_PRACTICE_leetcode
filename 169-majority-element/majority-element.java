// import java.util.*;
// class Solution {
//     public int majorityElement(int[] nums) {
// //         int n=nums.length;
//         int l=0;
//         int count=1;
//         int temp=1;
//            int ans=0;
//         for(int r=1;r<n;r++){
//             if(nums[l]==nums[r]){
//                 count=count+1;
//             }
//             else{
//                 temp=temp+1;
//             }
//             ans=Math.max(count,temp);
//         }
//        //  return ans;
//           return nums[ans];
//     }
// }


// Mores's Voting Algorithm
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {



int majority=nums[0];
int votes=1;
for(int i=1;i<nums.length;i++){
    if(votes==0){
        majority=nums[i];
        votes++;
    }
    else if(majority==nums[i]){
        votes++;
    }
    else{
        votes--;
    }
}
return majority;
    }
}





