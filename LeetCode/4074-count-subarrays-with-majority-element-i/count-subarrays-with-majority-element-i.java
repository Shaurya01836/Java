class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
         int res = 0;

        for (int i = 0; i < nums.length; i++) {

            int cnt = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target)
                    cnt++;
                else
                    cnt--;

                if (cnt > 0)
                    res++;
            }

        }

        return res;
    }
}