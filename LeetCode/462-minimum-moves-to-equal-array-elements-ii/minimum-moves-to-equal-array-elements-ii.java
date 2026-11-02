class Solution {
    public int minMoves2(int[] nums) {

        int res = 0;

        Arrays.sort(nums);

        int median = nums[nums.length / 2];

        for (int num : nums) {
            res += Math.abs(num - median);
        }

        return res;
    }
}