package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {


    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double profit = 0;
        int w = 0;


        for (int i = value.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (w + weight[idx] <= capacity) {
                profit += value[idx];
                w += weight[idx];
            } else {
                int remain = capacity - w;
                profit += ratio[i][1] * remain;
                break;
            }
        }

        System.out.println(profit);

    }

}
