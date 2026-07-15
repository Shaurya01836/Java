class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>() ; 

        int res = 0 , l = 0 ; 

        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r) ; 

           while(l < s.length() && set.contains(ch)){
            set.remove(s.charAt(l++)) ; 
           }

           set.add(ch);

           res = Math.max(res , r-l+1) ; 
        }

        return res ; 
    }
}