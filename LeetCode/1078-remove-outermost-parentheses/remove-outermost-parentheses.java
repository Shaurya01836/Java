class Solution {
    public String removeOuterParentheses(String s) {

        int degree = 0 ; 
        StringBuilder str = new StringBuilder() ; 

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ; 

            if(ch == '('){
                if(degree > 0)str.append(ch) ; 
                degree++ ; 
            }else{
                degree -- ; 
                if(degree > 0)str.append(ch) ; 
            }
        }

        return str.toString() ; 
    }
}