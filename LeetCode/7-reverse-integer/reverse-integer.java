class Solution {
    public int reverse(int x) {
        long num = x;

        if (num < 0) {
            num = -num;
        }

        long reversed = 0;

        while (num > 0) {
            reversed = (reversed * 10) + num % 10;
            num /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        if (x >= 0)
            return (int)reversed;
        else
            return (int)-reversed;
    }
}