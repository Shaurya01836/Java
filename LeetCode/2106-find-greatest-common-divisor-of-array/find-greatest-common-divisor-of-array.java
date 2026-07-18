class Solution {
    public int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ; 

        for(int i : nums){
            min = Math.min(min , i) ; 
            max = Math.max(max , i) ; 
        }

        int ans = 1 ; 

        for(int i = min ; i >= 1 ; i--){
            if(min % i == 0 && max % i == 0){
                return i ; 
            }
        }

        return ans ; 

        
    }
}