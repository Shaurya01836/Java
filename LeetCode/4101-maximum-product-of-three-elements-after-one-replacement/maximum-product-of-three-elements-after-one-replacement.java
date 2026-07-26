class Solution {
    public long maxProduct(int[] nums) {
        long max1 = 0;
        long max2 = 0;

        for (int num : nums) {
            long x = Math.abs((long) num);

            if (x >= max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }

        return max1 * max2 * 100000L;
    }
}