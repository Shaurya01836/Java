public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
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
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
