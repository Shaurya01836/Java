import PrintArray.printArray;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        //for finding the largest number
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        //new array
        int count[] = new int[largest + 1];
        //define the frequency of numbers
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 3, 1};
        printArray p = new printArray();
        System.out.print("Array before Sorting : ");
        p.printingArrayFunction(arr);
        System.out.println();
        System.out.print("Array after Sorting : ");
        countingSort(arr);
        p.printingArrayFunction(arr);
    }
}
