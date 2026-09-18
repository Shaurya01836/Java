class Solution {

    boolean binarySearch(int nums[], int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return true;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return false;
    }

    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            if (!binarySearch(nums, i)) {
                list.add(i);
            } else {
                List<Integer> temp = new ArrayList<>();

                if (list.size() != 0) {
                    int start = list.get(0), end = list.get(list.size() - 1);

                    temp.add(start);
                    temp.add(end);
                    res.add(temp);
                }

                list = new ArrayList<>();
                temp = new ArrayList<>();
            }
        }

        List<Integer> temp = new ArrayList<>();

        if (list.size() != 0) {
            int start = list.get(0), end = list.get(list.size() - 1);

            temp.add(start);
            temp.add(end);
            res.add(temp);
        }

        return res;

    }
}