class Solution {
    public int countSpecialIntegers(int[] nums) {

        int res = 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            List<Integer> temp = new ArrayList<>();

            if (map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
            }

            temp.add(i);

            map.put(nums[i], temp);
        }

        for (List<Integer> temp : map.values()) {
            if (temp.size() == 3 && ((temp.get(1) - temp.get(0)) == (temp.get(2) - temp.get(1))))
                res++;
        }

        return res;

    }
}