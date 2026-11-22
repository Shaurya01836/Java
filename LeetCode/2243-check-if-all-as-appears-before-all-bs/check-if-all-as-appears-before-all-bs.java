class Solution {
    public boolean checkString(String s) {

        int a = -1 , b = -1 ; 

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ; 

            if( ch == 'a' )a = i ; 
            else if(ch == 'b' && b == -1) b = i ; 

        }

        if( a == -1 || b == -1 ) return true ; 
        
        return a < b ; 
    }
}