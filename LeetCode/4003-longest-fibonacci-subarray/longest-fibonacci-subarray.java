class Solution {
    public int longestSubarray(int[] nums) {
        int max = 2;

        int l = 0;

        for (int r = 0; r < nums.length; r++) {

            while ((r - l + 1) > 2 && (nums[r - 1] + nums[r - 2] != nums[r])) {
                l++;
            }

            max = Math.max(max, r - l + 1);

        }

        return max;
    }
}