package Backtracking;

public class Permutation {


    public static void findPermutation(String string, String ans) {

        if (string.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        String str;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            str = string.substring(0, i) + string.substring(i + 1);
            findPermutation(str, ans + ch);
        }

    }

    public static void main(String[] args) {
        String string = "abc";
        findPermutation(string, "");
    }

}
