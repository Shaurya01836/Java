class Solution {
    public int maxDepth(String s) {

        int left = 0 , right = 0 , res = 0 ; 

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i); 

            if(ch == '(')left ++ ; 
            else if(ch == ')')right++ ; 
            
            res = Math.max(res , left - right); 
        }

        return res ; 
    }
}