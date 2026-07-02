class Solution {
    public String removeOuterParentheses(String s) {
        
         int count=0;
        StringBuilder ans=new StringBuilder();


//Stack<Character>st=new Stack<>();
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);

//     if(ch=='('){

//         if(!st.isEmpty()){
//             ans.append(ch);
//         }
//         st.push(ch);
//     }
//     else{
//         st.pop();

//         if(!st.isEmpty()){
//             ans.append(ch);
//         }

//     }
// }
// return ans.toString();


if(ch=='('){

    if(count>0){
        ans.append(ch);
    }
    count++;
}
else{

    count--;
    if(count>0){
        ans.append(ch);
    }
}

}
return ans.toString();
    }
}