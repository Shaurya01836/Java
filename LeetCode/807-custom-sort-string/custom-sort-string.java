class Solution {
    public String customSortString(String order, String s) {

        StringBuilder res = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < order.length(); i++) {

            char ch = order.charAt(i);

            set.add(ch);

            if (map.containsKey(ch)) {
                int size = map.get(ch);

                for (int j = 0; j < size; j++) {
                    res.append(ch);
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch))res.append(ch); 
        }

        return res.toString();

    }
}