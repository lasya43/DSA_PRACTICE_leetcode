class Solution {

    public TreeNode sortedListToBST(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] nums = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return binary(nums, 0, nums.length - 1);
    }

    public TreeNode binary(int[] nums, int l, int r) {

        if (l > r) {
            return null;
        }

        int mid = (l + r) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = binary(nums, l, mid - 1);

        root.right = binary(nums, mid + 1, r);

        return root;
    }
}