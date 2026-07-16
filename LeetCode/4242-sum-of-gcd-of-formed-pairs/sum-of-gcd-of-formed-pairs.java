class Solution {

    long gcd(long a, long b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {

        long prefixGcd[] = new long[nums.length] ; 
        int max = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max , nums[i]) ; 

            prefixGcd[i] = (long)gcd(nums[i] ,max) ; 
        }

        Arrays.sort(prefixGcd) ; 

        int i = 0 , j = prefixGcd.length-1  ; 

        long res = 0 ; 

        while(i < j){
            res += gcd(prefixGcd[i] , prefixGcd[j]) ; 
            i++ ; 
            j-- ; 
        }

        return res ; 
    }
}