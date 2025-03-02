public class SubArraySum {

    static void subArray(int array[]) {

        int CurrSum = 0, MaxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    CurrSum += array[k];
                }
                if (MaxSum < CurrSum) {
                    MaxSum = CurrSum;
                }
                CurrSum = 0;
            }
        }

        System.out.println("Max Sum of Sub String are : " + MaxSum);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        subArray(array);
    }
}
