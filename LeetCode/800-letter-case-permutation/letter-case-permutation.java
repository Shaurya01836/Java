class Solution {

    List<String> rec(String s, int index, StringBuilder str, List<String> res) {

        if (index == s.length()) {
            res.add(str.toString());
            return res;
        }

        char ch = s.charAt(index);

        if (!Character.isDigit(ch)) {
            str.append(Character.toLowerCase(ch));
            rec(s, index + 1, str, res);
            str.deleteCharAt(str.length() - 1);

            str.append(Character.toUpperCase(ch));
            rec(s, index + 1, str, res);
            str.deleteCharAt(str.length() - 1);
        } else {
            str.append(ch);
            rec(s, index + 1, str, res);
            str.deleteCharAt(str.length() - 1); 
        }

        return res;
    }

    public List<String> letterCasePermutation(String s) {
        return rec(s , 0 , new StringBuilder() , new ArrayList<>()) ; 
    }
}