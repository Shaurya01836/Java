import java.util.ArrayList;

public class PairSum {

    public static boolean bruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean twoPointerApproach(ArrayList<Integer> list, int target) {
        int leftPointer = 0, rightPointer = list.size() - 1;
        while (leftPointer < rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(bruteForce(list, 5));
        System.out.println(twoPointerApproach(list, 50));
    }

}
