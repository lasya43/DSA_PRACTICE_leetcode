class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
                for(int i=0;i<s.length();i++){
                  char ch1=s.charAt(i);
                  hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
              }
                 for(int i=0;i<t.length();i++){
                  char ch2=t.charAt(i);
                  hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
              }

              if(hm1.size()!=hm2.size()){
                return false;
              }
            for(char key:hm1.keySet()){
                if(!hm2.containsKey(key)){
                    return false;
                }

                 if(!hm1.get(key).equals(hm2.get(key))){
                return false;
            }
            }
            return true;

    }
}