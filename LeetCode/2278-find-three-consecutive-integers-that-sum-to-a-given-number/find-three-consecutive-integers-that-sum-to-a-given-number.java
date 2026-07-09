class Solution {
    public long[] sumOfThree(long num) {
        long[] res; 

        long mid = num/ 3 ; 

        if(((mid - 1) + (mid +1) + (mid)) == num){
            res = new long[3] ; 
            res[0] = mid -1 ; 
            res[1] = mid ; 
            res[2] = mid + 1 ; 
        }else {
            res = new long[0] ; 
            
        }

        return res  ; 
    }
}