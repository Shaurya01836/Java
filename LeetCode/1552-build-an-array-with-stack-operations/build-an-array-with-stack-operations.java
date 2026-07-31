class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();

        List<String> res = new ArrayList<>();

        int j = 0;

        for (int i = 1; i <= n; i++) {

            if (j < target.length) {
                res.add("Push");
                stack.push(i);
            }

            if (j < target.length && target[j] != i) {
                stack.pop();
                res.add("Pop");
            } else {
                j++;
            }
        }

        return res;
    }
}