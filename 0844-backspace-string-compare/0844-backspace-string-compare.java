class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character>st1=new Stack<>();
        Stack<Character>st2=new Stack<>();


        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);

            if(ch1!='#'){
                st1.push(ch1);
            }
            else if(!st1.isEmpty()){
                st1.pop();
            }
        }

        
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);

              if(ch2!='#'){
                st2.push(ch2);
            }
            else if(!st2.isEmpty()){
                st2.pop();
            }
        }

        
      return st1.equals(st2);
    
    }
}