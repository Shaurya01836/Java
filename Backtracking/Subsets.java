package Backtracking;

public class Subsets {


    public static void findSubsets(String string, String ans, int i) {
        if (i == string.length()) {
            if (ans.isEmpty()) {
                System.out.print("null ");
            } else {
                System.out.print(ans + " ");
            }

            return;
        }

        findSubsets(string, ans + string.charAt(i), i + 1);

        findSubsets(string, ans, i + 1);


    }

    public static void main(String[] args) {
        String string = "abc";
        findSubsets(string, "", 0);
    }

}
