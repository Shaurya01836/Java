class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, List<String>> freq = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            freq.putIfAbsent(entry.getValue(), new ArrayList<>());
            freq.get(entry.getValue()).add(entry.getKey());

        }

        for (Integer frequency : freq.keySet()) {
            pq.add(frequency);
        }

        List<String> res = new ArrayList<>();

        while (res.size() < k) {
            List<String> temp = freq.get(pq.remove());
            Collections.sort(temp);
            for (int i = 0; i < temp.size(); i++) {
                res.add(temp.get(i));
                if(res.size() == k) return res ; 
            }
        }

        return res;

    }
}