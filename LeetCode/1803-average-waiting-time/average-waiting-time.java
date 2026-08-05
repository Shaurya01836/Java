class Solution {
    public double averageWaitingTime(int[][] customers) {

        double res = 0.0;

        int start = customers[0][0];

        for (int i = 0; i < customers.length; i++) {
            
            if(customers[i][0] > start) start = customers[i][0] ; 
            
            start = start + customers[i][1];
            res += (start - customers[i][0]);

        }

        return (double) res / customers.length;
    }
}