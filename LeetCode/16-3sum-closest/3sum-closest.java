class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1, k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(sum - target) < Math.abs(res - target) ||
                        Math.abs(sum - target) == Math.abs(res - target) && sum > res)
                    res = sum;

                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return res;
    }
}