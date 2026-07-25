class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, map.get(nums[i]));
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                for (int j = 0; j < map.get(nums[i]); j++) {
                    res.get(j).add(nums[i]) ; 
                }

                map.remove(nums[i]) ; 
            }

        }

        return res;

    }
}