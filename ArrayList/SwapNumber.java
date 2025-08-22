import java.util.ArrayList;
import java.util.Scanner;

public class SwapNumber {

    public static void swapNumbers(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i += 4) {
            list.add(i);
        }
        System.out.print("Enter your index 1 : ");
        int index1 = sc.nextInt();
        if (!(index1 >= 0 && index1 < list.size())) {
            System.out.println("Invalid index 1 !!");
            return;
        }
        System.out.print("Enter your index 2 : ");
        int index2 = sc.nextInt();
        if (!(index2 >= 0 && index2 < list.size() && index2 != index1)) {
            System.out.println("Invalid index 2 !!");
            return;
        }
        System.out.println("Before swapping : " + list);
        swapNumbers(list, index1, index2);
        System.out.println("After swapping : " + list);
    }

}
