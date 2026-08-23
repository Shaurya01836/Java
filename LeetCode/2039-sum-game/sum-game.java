class Solution {
    public boolean sumGame(String num) {

        int first = 0, second = 0;

        int firstSum = 0, secondSum = 0;

        for (int i = 0; i < num.length() / 2; i++) {
            char ch = num.charAt(i);

            if (ch == '?')
                first++;
            else
                firstSum += ch - '0';
        }

        for (int i = num.length() / 2; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch == '?')
                second++;
            else
                secondSum += ch - '0';
        }

        if (first == 0 && second == 0) {
            return firstSum != secondSum;
        }

        if ((first + second) % 2 == 1) {
            return true;
        }

        int diff = firstSum - secondSum;
        int questionDiff = second - first;

        return diff != (questionDiff / 2) * 9;

    }
}