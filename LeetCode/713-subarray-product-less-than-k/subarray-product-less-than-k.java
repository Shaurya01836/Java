class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0 , res = 0 , prefix = 1 ; 

        for(int r = 0 ; r < nums.length ; r++){
            prefix *= nums[r] ; 

            while(l <=r && prefix >= k){
                prefix /= nums[l++] ; 
            }

            res += (r-l+1) ; 
        }

        return res ; 
    }
}