class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>() ; 

        for(int i : nums){
            set.add(i) ; 
        }

        int i = 1 ; boolean flag = true  ; 

        while(flag){
            if(!set.contains(k * i))return k*i ; 
            i++; 
        }

        return -1 ;

        

    }
}