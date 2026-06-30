class Solution {
    public String[] divideString(String s, int k, char fill) {

        int n = s.length();
        int groups = (n + k - 1) / k;

        String[] ans = new String[groups];
        int index = 0;

        for (int i = 0; i < n; i += k) {

            String part = "";

            for (int j = i; j < i + k && j < n; j++) {
                part += s.charAt(j);
            }

            while (part.length() < k) {
                part += fill;
            }

            ans[index++] = part;
        }

        return ans;
    }
}
