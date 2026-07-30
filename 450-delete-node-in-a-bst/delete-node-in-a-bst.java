class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {

            root.left = deleteNode(root.left, key);

        } else if (key > root.val) {

            root.right = deleteNode(root.right, key);

        } else {

            // Node found

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode temp = getMin(root.right);

            root.val = temp.val;

            root.right = deleteNode(root.right, temp.val);
        }

        return root;
    }

    public TreeNode getMin(TreeNode root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}