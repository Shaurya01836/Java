class Solution {
    public String compressedString(String word) {
        int freq = 1;

        StringBuilder str = new StringBuilder();

        for (int i = 1; i < word.length(); i++) {
            char b = word.charAt(i);
            char a = word.charAt(i - 1);

            if (b != a || freq == 9) {
               str.append(freq);
                str.append(a);
                freq = 1;
            } else {
                freq++;
            }
        }

        str.append(freq);
        str.append(word.charAt(word.length() - 1));

        return str.toString();
    }
}