class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        StringBuilder res = new StringBuilder();

        int i = 25;

        while (i >= 0) {

            if (chars[i] == 0) {
                i--;
                continue;
            }

            int cnt = 0;

            while (chars[i] > 0 && cnt < repeatLimit) {
                res.append((char) ('a' + i));
                chars[i]--;
                cnt++;
            }

            if (chars[i] > 0) {

                int j = i - 1;

                while (j >= 0 && chars[j] == 0) {
                    j--;
                }

                if (j < 0)
                    break;

                res.append((char) ('a' + j));
                chars[j]--;
            }
        }

        return res.toString();
    }
}