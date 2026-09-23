class Solution {
    public int minOperations(int[] nums, int x) {

        int res = -1 , totalSum = 0 , n = nums.length , len = -1 , prefix = 0 ; 

        HashMap<Integer , Integer> map = new HashMap<>() ; 
        map.put(0 , -1) ; 

        for(int i = 0 ; i < n ; i++){
            totalSum += nums[i] ; 
           if (!map.containsKey(totalSum)) {
                map.put(totalSum, i);
            }
        }

        for(int i = 0 ; i < n ; i++){

            prefix += nums[i] ; 

            if(map.containsKey(prefix - (totalSum - x))){
                len = Math.max(len , i - map.get(prefix - (totalSum - x)) ); 
            }

        }

        if(len != -1){
            res = n - len ; 
        }

        return res ; 
    }
}