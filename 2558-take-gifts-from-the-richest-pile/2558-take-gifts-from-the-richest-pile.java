import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {

      PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       
      for(int i:gifts){
        pq.add(i);
      }
        for(int i=0;i<k;i++){
       int am= pq.poll();
       int sqt=(int)Math.sqrt(am);
             pq.add(sqt);
      }
         long ans=0;
        for(int i:pq){
            ans=ans+i;
        }
      
          return ans;
    }
}