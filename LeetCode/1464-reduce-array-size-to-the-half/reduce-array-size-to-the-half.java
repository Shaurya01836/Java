class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)-> b-a) ; 

        for(int freq : map.values()){
            max.add(freq) ; 
        }

        int curr = 0 , req = arr.length/2 , size = 0; 

        while(curr < req){
            curr += max.remove() ; 
            size++ ;  
        }

        return size ; 


    }
}