class Solution {
    public int totalFruit(int[] fruits) {
     
     HashMap<Integer,Integer> hm=new HashMap<>();
         int n=fruits.length;
    int ans=0;
    int temp=0;
    int l=0;
    for(int r=0;r<n;r++){

     int val=fruits[r];
     hm.put(val,hm.getOrDefault(val,0)+1);

     while(hm.size()>2){
        int lval=fruits[l];
        hm.put(lval,hm.get(lval)-1);
        if(hm.get(lval)==0){
            hm.remove(lval);
        }
        l++;
     }
       
       if(hm.size()<=2){
       ans=Math.max(ans,r-l+1);
       }
    } 
    return ans;  
    }
}