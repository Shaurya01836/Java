class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {

        if(s1.length() != s2.length()) return false ; 

        boolean flag = true  , flag1 = true ; 

        char [] str1 = s1.toCharArray() ; 
        char [] str2 = s2.toCharArray() ; 

        Arrays.sort(str1) ; 
        Arrays.sort(str2) ; 

        for(int i = 0 ; i < s1.length() ; i++){
            if(str1[i] < str2[i]){
                flag = false ; 
                break ; 
            }
        }

        for(int i = 0 ; i < s1.length() ; i++){
            if(str2[i] < str1[i]){
                flag1 = false ; 
                break ; 
            }
        }

        return flag || flag1 ; 
    }
}