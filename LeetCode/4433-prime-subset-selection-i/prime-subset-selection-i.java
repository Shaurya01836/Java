class Solution {
    public List<Integer> maxPrimes(int n, int s) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                int j = 2 ; 
                while((i * j) <= n){
                    prime[i*j] = false ; 
                    j++ ; 
                }
            }
        }

        List<Integer> res = new ArrayList<>() ;
        int currSum = 0 ;  

        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                currSum += i ; 
                 if(currSum > s) break ; 
                res.add(i) ;
            }
        }

        return res ; 


    }
}