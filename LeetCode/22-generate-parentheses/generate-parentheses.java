class Solution {

    List<String> list = new ArrayList<>() ; 

    void substring(int n , int a , int b , StringBuilder string){
        if(a+ b >= 2*n){
            if(a+b == 2*n){
                list.add(string.toString()) ; 
            }
            return ; 
        }
        if(a < n){
            substring(n , a+1 , b , string.append('(')) ; 
            string.deleteCharAt(string.length() - 1);
        }
        if(b < a){
            substring(n , a , b+1 , string.append(')')) ; 
            string.deleteCharAt(string.length() - 1);
        }

    }

    public List<String> generateParenthesis(int n) {
        substring(n , 0 , 0 , new StringBuilder()) ; 
        return list ; 
    }
}