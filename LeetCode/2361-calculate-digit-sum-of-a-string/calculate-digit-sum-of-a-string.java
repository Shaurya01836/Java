
class Solution {

    StringBuilder digit(StringBuilder str, int k) {

        int sum = 0, cnt = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            cnt++;
            sum += str.charAt(i) - '0';

            if (cnt == k) {
                res.append(sum);
                cnt = 0;
                sum = 0;
            }
        }

        if (cnt > 0) {
            res.append(sum);
        }

        return res;
    }

    public String digitSum(String s, int k) {

        StringBuilder str = new StringBuilder(s);

        while (str.length() > k) {
            str = digit(str, k);
        }

        return str.toString();
    }
}
