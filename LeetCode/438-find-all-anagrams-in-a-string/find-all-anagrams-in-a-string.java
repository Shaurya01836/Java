class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        if (p.length() > s.length())
            return res;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int l = 0, chars = map.size(), k = p.length();

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    chars--;
                }
            }

            while (l < s.length() && (r - l + 1) > k) {
                char ch2 = s.charAt(l);

                if (map.containsKey(ch2)) {
                    map.put(ch2, map.get(ch2) + 1);

                    if (map.get(ch2) == 1) {
                        chars++;
                    }
                }
                l++ ; 
            }

            if(chars == 0){
                res.add(l) ; 
            }
        }

        return res ; 

    }
}