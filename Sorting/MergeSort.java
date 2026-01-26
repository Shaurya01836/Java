package Sorting;

import PrintArray.printArray;

public class MergeSort {

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int[] tempArray = new int[r - l + 1];
        int i = l, j = mid+1, k = 0;

        while (i <= mid && j <= r) {
            if(arr[i] <= arr[j]){
                tempArray[k++] = arr[i++];
            }else if(arr[i] > arr[j]){
                tempArray[k++] = arr[j++] ;
            }
        }

        while (i <= mid){
            tempArray[k++] = arr[i++];
        }

        while (j <= r){
            tempArray[k++] = arr[j++];
        }

        for(int p = 0 , q = l ; p < tempArray.length ; p++ , q++){
            arr[q] = tempArray[p];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 2, 5};
        System.out.print("Array before sorting : ");
        printArray.printingArrayFunction(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("\nArray after sorting  : ");
        printArray.printingArrayFunction(arr);

    }

}
