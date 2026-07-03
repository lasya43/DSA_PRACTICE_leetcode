import java.util.*;

class Solution {

    private long power(long base, long pow, long MOD) {
        long res = 1;

        while (pow > 0) {
            if ((pow & 1) == 1) {
                res = (res * base) % MOD;
            }

            base = (base * base) % MOD;
            pow >>= 1;
        }

        return res;
    }

    public int numSubseq(int[] nums, int target) {

        int MOD = 1_000_000_007;
        Arrays.sort(nums);

        long ans = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            if (nums[i] + nums[j] > target) {
                j--;
            } else {
                ans = (ans + power(2, j - i, MOD)) % MOD;
                i++;
            }
        }

        return (int) ans;
    }
}