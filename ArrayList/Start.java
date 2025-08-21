import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0 ; i < 6 ; i++){
           list.add(i);
       }
        System.out.println(list);

       //for get specific element
        System.out.println(list.get(2));

        //delete element
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(2,50);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(2));

        list.add(1,65);
        System.out.println(list);

    }

}
