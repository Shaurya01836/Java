public class LargestString {

    public static String largestString(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String names[] = {"Shaurya", "Nitin", "Gaurav"};
        System.out.println("Largest String is : " + largestString(names));
    }

}
