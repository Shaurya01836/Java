class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int currSum = 0;
        int res[] = new int[queries.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                currSum += nums[i];
        }

        for (int i = 0; i < queries.length; i++) {
            if (nums[queries[i][1]] % 2 != 0) {
                nums[queries[i][1]] += queries[i][0];
                if (nums[queries[i][1]] % 2 == 0)
                    currSum += nums[queries[i][1]];
            } else {
                if ((nums[queries[i][1]] + queries[i][0]) % 2 == 0)
                    currSum += queries[i][0];
                else
                    currSum -= nums[queries[i][1]];

                nums[queries[i][1]] += queries[i][0];

            }

            res[i] = currSum;
        }

        return res;
    }
}