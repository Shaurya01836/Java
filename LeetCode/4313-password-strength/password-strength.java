class Solution {
    public int passwordStrength(String password) {
        int res = 0 ; 

        HashSet<Character> set = new HashSet<>() ; 

        for(char ch : password.toCharArray()){

            if(!set.contains(ch)){
                if(ch >= 48 && ch <= 57) res += 3 ;
                else if(ch >= 65 && ch <= 90) res += 2 ; 
                else if(ch >= 97 && ch <= 122) res++ ; 
                else res += 5 ;  
            }

            set.add(ch) ; 
        }

        return res ; 

    }
}