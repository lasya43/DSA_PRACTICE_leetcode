class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String merge="";
       int n=Math.min(word1.length(),word2.length());

      for(int i=0;i<n;i++){
        merge =merge+word1.charAt(i);
        merge=merge+word2.charAt(i);
      }

for(int i=n;i<word1.length();i++){
    merge=merge+word1.charAt(i);
}
for(int i=n;i<word2.length();i++){
    merge=merge+word2.charAt(i);
}
    return merge;
    }
}