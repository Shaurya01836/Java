class Solution {

    int res;

    void subset(int[] nums, int i, int or, int maxOr) {

        if (i == nums.length) {
            if (or == maxOr)
                res++;

            return;
        }

        //take 
        subset(nums, i + 1, or | nums[i], maxOr);

        //skip
        subset(nums, i + 1, or, maxOr);
    }

    public int countMaxOrSubsets(int[] nums) {

        int or = 0, n = nums.length;
        res = 0;

        for (int i : nums) {
            or = or | i;
        }

        subset(nums, 0, 0, or);

        return res;

    }
}