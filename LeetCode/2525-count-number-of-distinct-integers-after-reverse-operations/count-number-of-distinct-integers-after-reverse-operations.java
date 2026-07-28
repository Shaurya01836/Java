class Solution {

    int reversed(int num){
        int res = 0 ; 

        while(num > 0){
            res = (res * 10) + num % 10 ; 

            num /= 10 ; 
        }

        return res ; 
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ; 

        for(int i : nums){
            set.add(i) ; 
        }

        for(int i : nums){
            set.add(reversed(i)) ; 
        }

        return set.size() ; 


    }
}