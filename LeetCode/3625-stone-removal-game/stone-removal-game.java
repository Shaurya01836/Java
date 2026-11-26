class Solution {
    public boolean canAliceWin(int n) {

        int curr = 10, user = 1;

        while (n > 0) {
            if (n - curr < 0) {
                return (user == 0);
            } else {
                n = n - curr;
                curr -- ; 
                if (user == 1)
                    user = 0;
                else
                    user = 1;
            }
        }

        return (user == 0);
    }
}