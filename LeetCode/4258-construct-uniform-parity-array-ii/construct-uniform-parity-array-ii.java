class Solution {

    boolean checkEven(int num[]) {
        for (int i : num) {
            if (i % 2 != 0)
                return false;
        }

        return true;
    }

    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE ; 

        for(int i : nums1){
            min = Math.min(i , min) ; 
        }

        if(checkEven(nums1))return true ; 

        else {
            if(min % 2 == 1) return true ; 
            else return false ; 
        }
    }
}