import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list1.add(i);
        }
        for (int i = 5; i < 9; i++) {
            list2.add(i);
        }
        for (int i = 20; i < 24; i++) {
            list3.add(i);
        }
        Mainlist.add(list1);
        Mainlist.add(list2);
        Mainlist.add(list3);
        System.out.println(Mainlist);
    }

}
