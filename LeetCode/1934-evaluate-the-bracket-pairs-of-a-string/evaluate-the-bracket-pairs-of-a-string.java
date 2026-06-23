class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> string : knowledge) {
            map.put(string.get(0), string.get(1));
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                int j = i;
                while (j < s.length() && s.charAt(j) != ')') {
                    j++;
                }

                str.append(map.getOrDefault(s.substring(i + 1, j), "?"));

                i = j;
            } else {
                str.append(ch);
            }
        }

        return str.toString();

    }
}