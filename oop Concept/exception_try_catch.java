// we have to find the duplicate values in the array
public class exception_try_catch {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 2, 4, 6 };
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        throw new Exception("Duplicate value Found");
                    } else if(i== arr.length -1) {
                        System.out.println("there is not duplicate value");
                    }
                }
            }

        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}

// exp3 me package and pattern printing , exponential power
// exp handling , string , buffer