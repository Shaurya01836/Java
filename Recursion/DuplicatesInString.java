import java.util.Scanner;

public class DuplicatesInString {


    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {

        //base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        //if true then do not append this
        if (map[currentChar - 'a']) {
            removeDuplicate(str, index + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean map[] = new boolean[27];
        StringBuilder newString = new StringBuilder();
        System.out.print("Enter a string (a-z): ");
        String string = sc.nextLine();
        System.out.print("String without duplication : ");
        removeDuplicate(string, 0, newString, map);
    }


}
