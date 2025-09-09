import java.util.Scanner;

public class ReverseSentence {

    public static String reverseString (String string){
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String string = sc.next();
        System.out.println("Reversed String : " + reverseString(string));
    }


}
