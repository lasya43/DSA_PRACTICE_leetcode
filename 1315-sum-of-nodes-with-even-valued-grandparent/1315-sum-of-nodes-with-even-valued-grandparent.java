/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {

      return pre(root,null,null);

    }
    public int pre(TreeNode root,TreeNode par,TreeNode grandp){
        if(root==null){
            return 0;
        }
        int sum=0;

        if(grandp!=null&&grandp.val%2==0){
             sum=sum=root.val;
        }

        sum=sum+pre(root.left,root,par);
        sum=sum+pre(root.right,root,par);
        return sum;
    }
   
}