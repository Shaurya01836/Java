class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res = "";

        int l = 0, ones = 0, len = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            if (ch == '1')
                ones++;

            while (l < s.length() && ones == k) {

                if (len > (r - l + 1)) {
                    len = r - l + 1;
                    res = s.substring(l, r + 1);

                } else if (len == (r - l + 1)) {
                   if(res.compareTo(s.substring(l, r + 1)) >= 0)res = s.substring(l, r + 1);
                }

                if (s.charAt(l) == '1')
                    ones--;
                l++;
            }
        }

        return res;
    }
}