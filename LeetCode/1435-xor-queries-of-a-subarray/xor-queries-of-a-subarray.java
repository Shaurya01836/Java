class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int prefixXor [] = new int[arr.length] ; 

        int currXor = 0 ; 

        for(int i = 0 ; i < arr.length ; i++){
            currXor ^= arr[i] ; 
            prefixXor[i] = currXor ;
        }

        int res [] = new int[queries.length] ; 

        int k = 0 ; 

        for(int [] query : queries){
            int start = query[0] ; 
            int end = query[1] ; 

            int curr ; 

            if(start == 0)curr =  prefixXor[end] ; 
            else curr = prefixXor[end] ^ prefixXor[start-1]; 

            res[k++] = curr ; 

        }

        return res ; 
    }
}