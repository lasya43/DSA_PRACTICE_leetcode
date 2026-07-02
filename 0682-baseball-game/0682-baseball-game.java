class Solution {
    public int calPoints(String[] operations) {
        
        Stack <Integer> st=new Stack<>();

        for(int i=0;i<operations.length;i++){
            String s=operations[i];

            if(s.equals("+")){
               int t= st.pop();
                 int to=st.peek();
                 int plus=t+to;
                 st.push(t);
                 st.push(plus);
                 
             }
             
             else if(s.equals("C")){
                 st.pop();
                 
             }
             else if(s.equals("D")){
                 int val=st.peek();
                 int d=val*2;
                 st.push(d);
             }
             else{
                 st.push(Integer.valueOf(s));
             }
         }

         int ans=0;
         for(int i:st){
            ans=ans+i;
         }
  
         
        return ans;


    }
}