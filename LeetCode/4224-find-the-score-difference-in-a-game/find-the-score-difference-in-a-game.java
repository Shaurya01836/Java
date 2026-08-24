class Solution {
    public int scoreDifference(int[] nums) {

        int firstPlayer = 0, secondPlayer = 0;

        boolean flag = true;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 1) {
                flag = !flag;
            }

            if ((i + 1) % 6 == 0) {
                flag = !flag;
            }

            if (flag)
                firstPlayer += nums[i];
            else
                secondPlayer += nums[i];
        }

        return firstPlayer - secondPlayer;

    }
}