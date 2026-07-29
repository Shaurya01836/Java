class Solution {
    public String stringHash(String s, int k) {

        int currSum = 0;
        int cnt = 0;

        StringBuilder str = new StringBuilder() ; 

        for (int i = 0; i < s.length(); i++) {
            cnt++;
            currSum += s.charAt(i) - 'a';

            if (cnt == k) {
                str.append((char)((currSum % 26) + 97)) ; 
                currSum = 0 ; 
                cnt = 0 ; 
            }
        }

        return str.toString() ; 

    }
}