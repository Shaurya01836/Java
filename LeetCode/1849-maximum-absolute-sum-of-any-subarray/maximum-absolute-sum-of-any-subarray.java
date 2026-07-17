class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = Integer.MAX_VALUE, currMaxSum = 0, currMinSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currMaxSum += nums[i];
            currMinSum += nums[i];

            if (currMaxSum < 0) {
                currMaxSum = 0;
            }

            if(currMinSum >= 0){
                currMinSum = 0 ; 
            }

            maxSum = Math.max(maxSum , currMaxSum) ; 
            minSum = Math.min(minSum , currMinSum) ; 
        }

        return Math.max(maxSum , Math.abs(minSum)) ; 
    }
}