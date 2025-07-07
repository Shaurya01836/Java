//Print the number of 7’s that are in the 2d array

public class practiceQuestion1 {

    public static int find(int arr[][], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[][] array = {{4, 7, 8}, {8, 8, 7}};
        System.out.println(find(array, 7));
    }
}
