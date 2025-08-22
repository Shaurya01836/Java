import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int bruteForceMethod(ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int area = height * width;
                result = Math.max(area, result);
            }
        }
        return result;
    }

    public static int twoPointerApproach(ArrayList<Integer> list) {
        int result = 0;
        int leftPointer = 0, rightPointer = list.size() - 1;
        while (leftPointer < rightPointer) {
            int height = Math.min(list.get(leftPointer), list.get(rightPointer));
            int width = rightPointer - leftPointer;
            int area = height * width;
            result = Math.max(area, result);

            if (list.get(leftPointer) < list.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(bruteForceMethod(list));
        System.out.println(twoPointerApproach(list));
    }

}
