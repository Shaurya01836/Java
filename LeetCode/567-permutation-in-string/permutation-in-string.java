class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int chars = map.size();
        int k = s1.length(), l = 0;

        for (int r = 0; r < s2.length(); r++) {
            char ch = s2.charAt(r);

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0)
                    chars--;
            }

            while (l < s2.length() && (r - l + 1) > k) {
                char ch2 = s2.charAt(l);

                if (map.containsKey(ch2)) {

                    map.put(ch2, map.get(ch2) + 1);

                    if (map.get(ch2) == 1)
                        chars++;
                }

                l++ ; 

            }

            if (chars == 0)
                return true;
        }

        return false;

    }
}