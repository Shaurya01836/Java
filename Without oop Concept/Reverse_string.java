
import java.util.Scanner;

public class Reverse_string {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.print("Enter a name : ");
        name = s.next();
        String name1 = "";
        int n = name.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (name.charAt(i) != ' ') {
                char temp = name.charAt(i);
                name1 = name1 + temp;
            }

        }
        System.out.println("Reversed name :" + name1);

    }
}
