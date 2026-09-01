class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> res = new ArrayList<>() ; 
        HashMap<Integer, List<Integer>> map = new HashMap<>() ; 

        for(int i = 0 ; i < groupSizes.length ; i++){

            List<Integer> list = new ArrayList<>() ; 

            if(map.containsKey(groupSizes[i])){
                list = map.get(groupSizes[i]) ; 
            }

            list.add(i) ; 

            map.put(groupSizes[i] , list) ; 
        }

        for(Map.Entry<Integer , List<Integer>> entry : map.entrySet()){

            List<Integer> temp = new ArrayList<>() ; 
            int cnt = 0 ; 

            for(int i = 0 ; i < entry.getValue().size() ; i++){
                temp.add(entry.getValue().get(i)) ; 
                cnt ++ ; 

                if(cnt % entry.getKey() == 0 ){
                    res.add(temp) ;
                    temp = new ArrayList<>() ;  
                }


            } 
        }

        return res ; 
    }
}