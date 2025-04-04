import java.util.Scanner;

public class String_prog {
    public static void main(String[] args) {
        String name = "Shaurya Upadhyay";
        System.out.println(name);
        String name2 = new String("Nitin Jain");
        System.out.println(name2);
        String name3;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name :");
        name3 = s.next();
        System.out.println(name3);
        int count = 0;
        for (int i = 0; i < name3.length(); i++) {
            if (name3.charAt(i) != ' ') {
                count++;
            }

        }
        System.out.print("Word count of name3 is :");
        System.out.println(count);

    }
}
