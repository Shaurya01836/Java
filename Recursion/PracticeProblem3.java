import java.util.Scanner;

public class PracticeProblem3 {


    public static int lengthOfString(String string) {
        if (string.length() == 0) {
            return 0;
        }

        return lengthOfString(string.substring(1)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = sc.nextLine();
        System.out.println("Length of the string : " + lengthOfString(string));
    }

}
