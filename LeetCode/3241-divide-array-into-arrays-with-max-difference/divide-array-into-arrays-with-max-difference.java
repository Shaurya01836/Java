class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length ; 

        int [][] res = new int[n/3][3] ; 

        Arrays.sort(nums) ; 

        int j = 0 ; 

        for(int i = 0 ; i < n ; i+= 3){
            int num1 = nums[i] ; 
            int num2 = nums[i+1] ; 
            int num3 = nums[i+2] ;

            if(num3 - num1 > k) return new int[0][0] ; 
            else{
                res[j][0] = num1 ; 
                res[j][1] = num2 ; 
                res[j][2] = num3 ; 
                j++ ; 
            } 
        }

        return res ; 
    }
}