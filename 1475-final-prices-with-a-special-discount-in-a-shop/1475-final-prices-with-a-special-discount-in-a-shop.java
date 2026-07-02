// class Solution {
//     public int[] finalPrices(int[] prices) {
        
// //  int val=0;
// //          int ans[]=new int[prices.length];
     

// //      for(int i=0;i<prices.length;i++){
// //         ans[i]=prices[i];
// //         for(int j=i+1;j<prices.length;j++){

// //             if(prices[i]>=prices[j]){
// //                 ans[i]=prices[i]-prices[j];
// //                 break;
// //             }
// //         }
// //      }
// //         return ans;

// Stack<Integer>st=new Stack<>();
// for(int i=0;i<prices.length;i++){



// while(!st.isEmpty()&& st.peek()>prices[i]){}
//    st.pop();

// }

//     }
// }

class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();
        int n = prices.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            int val = prices[i];   // Store original price

            if (!stack.isEmpty()) {
                prices[i] -= stack.peek();
            }

            stack.push(val);       // Push original price
        }

        return prices;
    }
}