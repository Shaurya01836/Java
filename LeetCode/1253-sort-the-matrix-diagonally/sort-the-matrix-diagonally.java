class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int m = mat.length, n = mat[0].length;

        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                if (map.containsKey(i - j)) {
                    pq = map.get(i - j);
                }
                pq.add(mat[i][j]);
                map.put(i - j, pq);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = map.get(i - j).remove();
            }
        }

        return mat;

    }
}