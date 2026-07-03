class Solution {
    public int minimumDeletions(int[] nums) {
        int max = 0 , min = 0  ; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > nums[max]){
                max = i ; 
            }else if (nums[i] < nums[min]){
                min = i ; 
            }
        }

        int res = Integer.MAX_VALUE ; 

        // from front 
        res = Math.min(res , Math.max(min , max) + 1) ; 

        // from back 
        res = Math.min(res , nums.length - Math.min(min , max)) ; 

        //from both side 

        res = Math.min(res , (Math.min(min , max) + 1) + (nums.length - Math.max(min , max))) ; 

        return res ; 
    }
}