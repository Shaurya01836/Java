class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            str.append(Integer.toBinaryString(i));
        }

        int j = 0;

        long res = 0;
        int mod = 1000000007;

         for (int i = 0; i < str.length(); i++) {
            res = (res * 2 + (str.charAt(i) - '0')) % mod;
        }


        return (int) res;

    }
}