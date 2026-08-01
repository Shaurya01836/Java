class Solution {

    List<String> res = new ArrayList<>();

    void rec(HashSet<String> set, int length, StringBuilder str) {

        if(str.length() == length){
            if(!set.contains(str.toString())){
                res.add(str.toString()) ; 
            }
            return ; 
        }

        str.append("0");
        rec(set, length, str);
        str.deleteCharAt(str.length() - 1);

        str.append("1");
        rec(set, length, str);
        str.deleteCharAt(str.length() - 1);
    }

    public String findDifferentBinaryString(String[] nums) {

        HashSet<String> set = new HashSet<>();

        for (String s : nums) {
            set.add(s);
        }

        int length = 0;

        length = nums[0].length();

        rec(set , length , new StringBuilder()) ; 

        return res.get(0) ; 

    }
}