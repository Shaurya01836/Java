class Solution {
    public long countCommas(long n) {

        long res = 0, len = 4;

        for (long i = 1000; i <= n; i *= 10) {

            long end = Math.min(n, i * 10 - 1);
            long mul = end - i + 1;

            long commas = (long) Math.ceil(len / 3.0) - 1;

            res += commas * mul;

            len++;
        }

        return res;

    }
}