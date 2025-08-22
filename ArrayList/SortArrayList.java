import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(55);
        list.add(12);
        list.add(2);
        System.out.println("Before sorting the list : " + list);
        //ascending order
        Collections.sort(list);
        System.out.println("After sorting the list : " + list);
        //descending order
//        Collections.sort(list , Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println("After sorting the list : " + list);
    }

}
