package Greedy;

public class ActivitySelection {

    public static int greedyActivitySelection(int[] start, int[] end) {
        int maxActivity = 1;
        int lastEnd = end[0];
        for (int i = 1; i < start.length; i++) {
            if (lastEnd <= start[i]) {
                maxActivity++;
                lastEnd = end[i];
            }
        }
        return maxActivity;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        System.out.println(greedyActivitySelection(start, end));
    }

}
