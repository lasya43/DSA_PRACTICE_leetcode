class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if (leftVal > rightVal) {
                res[index--] = leftVal;
                left++;
            } else {
                res[index--] = rightVal;
                right--;
            }
        }

        return res;
    }
}