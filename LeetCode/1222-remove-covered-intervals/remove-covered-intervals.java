class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int cnt = 0, maxEnd = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] > maxEnd) {
                cnt++;
                maxEnd = intervals[i][1];
            }
        }

        return cnt;
    }
}