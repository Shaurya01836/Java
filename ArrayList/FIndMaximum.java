import java.util.ArrayList;

public class FIndMaximum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0 ; i < 50 ; i += 4 ){
           list.add(i);
       }

       int max = Integer.MIN_VALUE;
       for (int i = 0 ; i < list.size(); i++){
           max = Math.max(list.get(i), max);
       }

        System.out.println("The max value in this list is : " + max);
    }

}
