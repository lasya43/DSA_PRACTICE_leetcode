class Solution {
    public int largestAltitude(int[] gain) {
        
         int[] pos=new int[gain.length+1];
         pos[0]=0;
         pos[1]=gain[0];
        for(int i=1;i<gain.length;i++){
          pos[i+1]=pos[i]+gain[i];
        }
        int max=pos[0];
        for(int i=0;i<pos.length;i++){
            if(pos[i]>max){
                max=pos[i];
            }
        }
        return max;
    }
}