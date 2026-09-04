class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int max[] = new int[n];
        int min[] = new int[n];

        int maxNum = Integer.MIN_VALUE , minNum = Integer.MAX_VALUE ;

        for (int i = 0; i < n; i++) {
            maxNum = Math.max(maxNum, nums[i]);
            max[i] = maxNum;

            minNum = Math.min(minNum , nums[n-i-1]) ; 
            min[n-i-1] = minNum ; 
        }
        
        int res = -1 ; 

        for (int i = 0; i < n; i++) {
            if(max[i] - min[i] <= k)return i ; 
        }

        return res ;
    }
}