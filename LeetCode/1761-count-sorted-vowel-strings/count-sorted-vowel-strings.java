class Solution {

    int cnt = 0;

    void rec (int n , char [] arr , StringBuilder str , int start){

        if(n == str.length()){
            cnt ++ ; 
            return ;
        }

        for(int i = start ; i < arr.length ; i++){
            str.append(arr[i]) ; 
            rec(n , arr , str , i) ; 
            str.deleteCharAt(str.length()-1) ; 
        }
    }

    public int countVowelStrings(int n) {

        char arr[] = { 'a', 'e', 'i', 'o', 'u' };

        rec(n, arr, new StringBuilder(), 0);

        return cnt ; 

    }
}