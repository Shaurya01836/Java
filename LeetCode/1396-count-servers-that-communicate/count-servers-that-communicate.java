class Solution {
    public int countServers(int[][] grid) {

        int totalServer = 0;

        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean server = false ; 

                if(grid[i][j] == 1){
                    //row check
                    for(int k = 0 ; k < n ; k++){
                        if(grid[i][k] == 1 && k != j){
                            server = true ; 
                            break ; 
                        }
                    }

                    //col check
                    for(int k = 0 ; k < m ; k++){
                        if(grid[k][j] == 1 && k != i){
                            server = true ; 
                            break ; 
                        }
                    }

                    if(server)totalServer++ ; 
                }
            }
        }

        return totalServer;

    }
}