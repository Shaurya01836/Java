public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 3, 1};
        System.out.print("Array before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Array after Sorting : ");
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
