class Solution {

    public boolean palindrome(StringBuilder str){
        int i = 0 , j = str.length()-1 ;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false ; 
            j-- ; 
            i++ ; 
        } 

        return true; 
    }

    public int countSubstrings(String s) {
        int cnt = 0 , n = s.length(); 

        for(int i = 0 ; i < n ; i++ ){
            StringBuilder str = new StringBuilder() ; 
            for(int j = i ; j < n ; j++){
                str.append(s.charAt(j)) ; 

                if(palindrome(str))cnt ++ ; 
            }
        }

        return cnt ; 
    }
}