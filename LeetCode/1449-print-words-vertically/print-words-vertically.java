class Solution {
    public List<String> printVertically(String s) {
        
        List<String> list = new ArrayList<>() ; 

        String[] arr = s.split(" ") ; 

        int len = 0 ; 

        for(int i = 0 ; i < arr.length ; i++){
            len = Math.max(len , arr[i].length()) ; 
        }


        for(int i = 0 ; i < len ; i++){
            StringBuilder str = new StringBuilder() ;
            for(int j = 0 ; j < arr.length ; j++){
                 if (i < arr[j].length()) str.append(arr[j].charAt(i)); 
                 else str.append(' ') ; 
            }
            list.add(str.toString().stripTrailing()) ; 
        }

        return list ; 

    }
}