class Solution {
    public int reverseDegree(String s) {
        int degree = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            int n = 123 - s.charAt(i);
            degree += (n * (i+1));
        }
        return degree;
    }
}