class Solution {

    // using hints 😭

    boolean isSorted(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int minOperations(String s) {

        int n = s.length();
        char min = 'z', max = 'a';

        for (char c : s.toCharArray()) {
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (isSorted(s)) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        if (first == min || last == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;

    }
}