



class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(0);
            } 
            else {

                int val = 0;

           
                while (st.peek() != 0) {
                    val += st.pop();
                }

                st.pop();

            
                if (val == 0) {
                    st.push(1);
                } 
                else {
                    st.push(2 * val);
                }
            }
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}