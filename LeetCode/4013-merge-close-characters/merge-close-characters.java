class Solution {
    public String mergeCharacters(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int a = map.get(ch);

                if ((index - a) > k) {
                    str.append(ch);
                    map.put(ch, index);
                    index++;
                }
            } else {
                str.append(ch);
                map.put(ch, index);
                index++;
            }
        }

        return str.toString();
    }
}