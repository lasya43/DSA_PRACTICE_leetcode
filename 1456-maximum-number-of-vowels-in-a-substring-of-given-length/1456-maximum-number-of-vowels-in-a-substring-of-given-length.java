class Solution {
     public static boolean isVowel(char ch){
        return ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u';
      }
    public int maxVowels(String s, int k) {
        int l=0;
        int count=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))){
                count++;
            }
            if(r-l+1==k){
                max=Math.max(max,count);

                if(isVowel(s.charAt(l))){
                    count--;
                }
                l++;
            }

        }
        return max;
     
    }
}