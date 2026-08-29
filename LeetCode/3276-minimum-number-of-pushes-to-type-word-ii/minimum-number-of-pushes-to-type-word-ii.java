class Solution {
    public int minimumPushes(String word) {

        int freq[] = new int[26];

        int res = 0, cnt = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        for (int i = 25; i >= 0; i--) {

            res += ((cnt / 8) + 1) * freq[i];

            if (freq[i] != 0)
                cnt++;

        }

        return res;

    }
}