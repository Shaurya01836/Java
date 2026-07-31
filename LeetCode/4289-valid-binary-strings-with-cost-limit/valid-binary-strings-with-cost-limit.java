class Solution {

    List<String> rec(int n, int k, char prev, StringBuilder str, int cost, List<String> res) {

        if (n == str.length()) {
            if (cost <= k)
                res.add(str.toString());
            return res;
        }

        if (cost > k)
            return res;

        str.append('0');
        rec(n, k, '0', str, cost, res);
        str.deleteCharAt(str.length() - 1);

        if (prev != '1') {
            int idx = str.length();
            str.append('1');
            rec(n, k, '1', str, cost + idx, res);
            str.deleteCharAt(str.length() - 1);
        }

        return res;
    }

    public List<String> generateValidStrings(int n, int k) {
        return rec(n, k, '0', new StringBuilder(), 0, new ArrayList<>());
    }
}