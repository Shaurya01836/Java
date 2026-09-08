class Solution {
    public int countCommas(int n) {
         int res = 0, len = 4;

        for (int i = 1000; i <= n; i *= 10) {

            int end = Math.min(n, i * 10 - 1);
            int mul = end - i + 1;

            int commas = (int) Math.ceil(len / 3.0) - 1;

            res += commas * mul;

            len++;
        }

        return res;
    }
}