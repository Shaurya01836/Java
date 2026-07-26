class Solution {
    public String arrangeWords(String text) {

        String[] arr = text.split(" ");

        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        StringBuilder str = new StringBuilder();

        boolean flag = true;

        for (String string : arr) {
            if (flag) {
                str.append(string.substring(0, 1).toUpperCase() +
                        string.substring(1, string.length()) + " ");

                flag = false;
            }else {
                  str.append(string.substring(0, 1).toLowerCase() +
                        string.substring(1, string.length()) + " ");
            }

        }

        str.deleteCharAt(str.length() - 1);
        return str.toString();

    }
}