class Solution {
    int res = 0;

    void rec(String[] words, char[] letters, int[] score, int start,
            HashMap<Character, Integer> map, int cnt) {

        for (int i = start; i < words.length; i++) {

            String word = words[i];
            int currScore = 0;
            boolean possible = true;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) - 1);

                if (map.get(ch) < 0) {
                    possible = false;
                }
                currScore += score[ch - 'a'];
            }

            if (possible) {
                res = Math.max(res, cnt + currScore);
                rec(words, letters, score, i + 1, map, cnt + currScore);
            }

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                map.put(ch, map.get(ch) + 1);
            }

        }
    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : letters) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        rec(words, letters, score, 0, map, 0);
        return res;
    }
}