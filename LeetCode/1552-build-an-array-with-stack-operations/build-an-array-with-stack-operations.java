class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();

        int j = 0;

        for (int i = 1; i <= n; i++) {

            if (j < target.length) {
                res.add("Push");
            }

            if (j < target.length && target[j] != i) {
                res.add("Pop");
            } else {
                j++;
            }
        }

        return res;
    }
}