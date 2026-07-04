class Solution {
    public int pivotIndex(int[] nums) {
        int left[] = new int[nums.length] ; 
        int right[] = new int[nums.length] ; 

        int leftSum = 0 , rightSum = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            leftSum += nums[i] ; 
            left[i] = leftSum ; 

            rightSum += nums[nums.length -i-1] ; 
            right[nums.length -i-1] = rightSum ; 
        }


        for(int i = 0 ; i < nums.length ; i++){

            if(left[i] == right[i]) return i ; 
        }

        return -1 ; 
    }
}