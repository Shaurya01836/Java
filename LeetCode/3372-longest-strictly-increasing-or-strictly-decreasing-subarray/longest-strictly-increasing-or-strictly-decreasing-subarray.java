class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int res = 1, n = nums.length;

        //strictly increasing check 

        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[j - 1])
                    curr++;
                else
                    break;
            }

            res = Math.max(curr, res);
        }
        //strictly decreasing check 

        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[j - 1])
                    curr++;
                else
                    break;
            }

            res = Math.max(curr, res);
        }


        return res ; 
    }

}