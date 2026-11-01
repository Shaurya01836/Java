class Solution {
    public int minMoves(int[] nums) {
        int res = 0 , min = Integer.MAX_VALUE; 

        for(int i : nums){
            min = Math.min(min , i) ; 
        }

        for(int i : nums){
            res += i- min ; 
        }

        return res ;
    }
}