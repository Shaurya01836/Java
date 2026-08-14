class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character , Integer> map = new HashMap<>() ; 

        int l = 0 ; 

        int res = 0 ; 

        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r) ; 

            map.put(ch , map.getOrDefault(ch , 0)+1); 

            while(l < s.length() && map.get(ch) > 2){
                map.put(s.charAt(l) , map.getOrDefault(s.charAt(l) , 0) - 1); 
                l++ ; 
            }

            res = Math.max(res , r-l+1) ; 
        }

        return res ; 
    }
}