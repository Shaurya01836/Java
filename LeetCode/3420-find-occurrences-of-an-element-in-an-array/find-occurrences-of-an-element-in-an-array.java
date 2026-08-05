class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        List<Integer> list = new ArrayList<>() ; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == x)list.add(i) ; 
        }

        int [] res = new int[queries.length] ; 

        for(int i = 0 ; i < queries.length ; i++){
            if(queries[i] > list.size())res[i] = -1 ; 
            else res[i] = list.get(queries[i]-1) ; 
        }

        return res ; 

    }
}