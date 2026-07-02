class Solution {
    public boolean isPalindrome(int x) {
     boolean temp=true;
      int las=0;
      int amm=x;
      while(x>0){
        int digit =x%10;
         las=las*10+digit;
         x=x/10;
        
      }
      if(amm==las){
        return true;
        }
     return false;

    }
    
}