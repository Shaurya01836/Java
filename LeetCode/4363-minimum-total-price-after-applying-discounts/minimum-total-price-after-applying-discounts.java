class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        double res = 0.0;
        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (i >= 0 && j >= 0) {
            res += (double) prices[i] * (100 - discounts[j]) / 100.0;
            i--;
            j--;
        }

        while (i >= 0) {
            res += prices[i];
            i--;
        }

        return res;
    }
}