class Solution {
    public int minSwaps(int[] nums) {

        Map<Integer, List<Integer>> unsortedMap = new HashMap<>();
        Map<Integer, List<Integer>> map = new TreeMap<>(unsortedMap);

        int[] duplicate = Arrays.copyOf(nums, nums.length);

        Arrays.sort(duplicate);

        int sumArr[] = new int[nums.length];

        for (int i : duplicate) {
            int num = i, sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            List<Integer> list = new ArrayList<>();
            if (map.containsKey(sum))
                list = map.get(sum);

            list.add(i);

            map.put(sum, list);
        }

        int j = 0;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> valueList = entry.getValue();

            for (int i = 0; i < valueList.size(); i++) {
                sumArr[j] = valueList.get(i);
                j++;
            }
        }

        Map<Integer, Integer> targetIndices = new HashMap<>();

        for (int i = 0; i < sumArr.length; i++) {
            targetIndices.put(sumArr[i], i);
        }

        boolean[] visited = new boolean[sumArr.length];
        int totalSwaps = 0;

        for (int i = 0; i < sumArr.length; i++) {
           
            if (visited[i] || targetIndices.get(nums[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int currentIdx = i;

            while (!visited[currentIdx]) {
                visited[currentIdx] = true;
                currentIdx = targetIndices.get(nums[currentIdx]);
                cycleSize++;
            }

            if (cycleSize > 0) {
                totalSwaps += (cycleSize - 1);
            }
        }

        return totalSwaps;

    }
}