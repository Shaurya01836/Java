class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        long sum = 0;

        StringBuilder str = new StringBuilder();

        while (n > 0) {
            int digit = n % 10 ; 
            if (digit != 0){
                str.insert(0, digit);
                sum += digit;
            }

            n /= 10 ;    
        }

        if(str.length() == 0) return 0 ; 

        res = Long.parseLong(str.toString()) * sum ; 

        return res ; 
    }
}