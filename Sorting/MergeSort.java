import PrintArray.printArray;

public class MergeSort {

    public static void mergeSort(int arr[], int startingIndex, int endingIndex) {

        //base case
        if (startingIndex >= endingIndex) {
            return;
        }

        //better for big values
        int mid = startingIndex + (endingIndex - startingIndex) / 2;

        mergeSort(arr, startingIndex, mid);
        mergeSort(arr, mid + 1, endingIndex);
        merge(arr, startingIndex, mid, endingIndex);

    }

    public static void merge(int arr[], int startingIndex, int mid, int endingIndex) {

        int tempArray[] = new int[endingIndex - startingIndex + 1];
        int i = startingIndex; // for left part
        int j = mid + 1; // for right part
        int k = 0; // for temp array

        while (i <= mid && j <= endingIndex) {
            if (arr[i] < arr[j]) {
                tempArray[k++] = arr[i++];
            } else if (arr[j] < arr[i]) {
                tempArray[k++] = arr[j++];
            } else {
                tempArray[k++] = arr[i++];
            }
        }

        // if some numbers remain in left part
        while (i <= mid) {
            tempArray[k++] = arr[i++];
        }

        // if some numbers remain in right part
        while (j <= endingIndex) {
            tempArray[k++] = arr[j++];
        }

        //copying the temp array to original one
        for (int p = 0, q = startingIndex; p < tempArray.length; p++, q++) {
            arr[q] = tempArray[p];
        }

    }

    public static void main(String[] args) {
        printArray print = new printArray();

        int arr[] = {6, 4, 1, 3, 2, 5};
        System.out.print("Array before sorting : ");
        print.printingArrayFunction(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("\nArray after sorting  : ");
        print.printingArrayFunction(arr);

    }

}
