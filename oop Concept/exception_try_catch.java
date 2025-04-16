// we have to find the duplicate values in the array
public class exception_try_catch {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 2, 4, 6 };
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        throw new Exception("Duplicate value Found");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

// exp3 me package and pattern printing , exponential power
// exp handling , string , buffer