class Solution {

    long MOD = 1_000_000_007L;

    long power(long base, long exp) {

        long result = 1;
        base %= MOD;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }

    public int sumDecoded(long[] nums) {

        long res = 0;

        for (long num : nums) {

            int width = (int) (num % 10);
            long di = num / 10;

            List<Integer> digits = new ArrayList<>();

            while (di > 0) {
                digits.add(0, (int) (di % 10));
                di /= 10;
            }

            long x = 0;
            long y = 0;

            for (int i = 0; i < width; i++) {
                x = x * 10 + digits.get(i);
            }

            for (int i = width; i < digits.size(); i++) {
                y = y * 10 + digits.get(i);
            }

            res = (res + power(x, y)) % MOD;
        }

        return (int) res;
    }
}