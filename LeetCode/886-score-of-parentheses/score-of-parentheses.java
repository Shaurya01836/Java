class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0, degree = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                degree++;
            } else {
                degree--;
                if (s.charAt(i - 1) == '(') {
                    res += Math.pow(2, degree);
                }
            }
        }

        return res;

    }
}