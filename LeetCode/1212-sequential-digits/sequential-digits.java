class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        List<Integer> ans = new ArrayList<>();

        for (int len = 2; len <= 9; len++) {

            StringBuilder str = new StringBuilder();
            int li = 0;

            for (int r = 0; r < num.length(); r++) {

                str.append(num.charAt(r));

                if (str.length() > len) {
                    str.deleteCharAt(0);
                    li++;
                }

                if (str.length() == len) {
                    int n = Integer.parseInt(str.toString());

                    if (n >= low && n <= high) {
                        ans.add(n);
                    }
                }
            }
        }

        return ans;
    }
}