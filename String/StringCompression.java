import java.util.Scanner;

public class StringCompression {

    public static String compression(String string) {

        if (string.isEmpty()) return "";

        StringBuilder str = new StringBuilder();
        int count = 1;
        char ch = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            } else {
                str.append(ch);
                if (count > 1) {
                    str.append(count);

                }
                ch = string.charAt(i);
                count = 1;
            }
        }

        str.append(ch);
        if (count > 1) {
            str.append(count);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = sc.nextLine();
        System.out.println(compression(string));
    }

}
