
class Solution {

    int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();

        int first = binarySearch(nums, target);
        int last = binarySearch(nums, target + 1);

        for (int i = first; i < last; i++) {
            res.add(i);
        }

        return res;
    }
}
