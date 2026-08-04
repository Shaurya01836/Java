class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums) ; 
        List<Integer> res = new ArrayList<>() ; 

        int a = nums[0] ; 

        for(int i = 0 ; i < nums.length ; i++){

            while(a != nums[i]){
                res.add(a) ; 
                a++ ; 
            }

            a++ ; 
        }

        return res ; 
    }
}