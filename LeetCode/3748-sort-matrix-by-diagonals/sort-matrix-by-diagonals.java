class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int m = grid.length, n = grid[0].length;

        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                PriorityQueue<Integer> pq  ; 

                if(i-j >= 0)pq = new PriorityQueue<>((a,b)-> b-a);
                else pq = new PriorityQueue<>();

                if (map.containsKey(i - j)) {
                    pq = map.get(i - j);
                }
                pq.add(grid[i][j]);
                map.put(i - j, pq);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = map.get(i - j).remove();
            }
        }

        return grid;
    }
}