class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, res = Integer.MAX_VALUE, currSum = 0;

        for (int r = 0; r < nums.length; r++) {
            currSum += nums[r];

            while (currSum >= target) {
                res = Math.min(res, r - l + 1);
                currSum -= nums[l++];
            }
        }


        if (res == Integer.MAX_VALUE)
            return 0;
        return res;
    }
}