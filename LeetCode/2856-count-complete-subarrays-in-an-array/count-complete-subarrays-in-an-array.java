class Solution {
    public int countCompleteSubarrays(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int unique = set.size();

        int res = 0;

        for (int r = 0; r < nums.length; r++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = r; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

                if (map.size() == unique)
                    res++;
            }
        }

        return res;

    }
}