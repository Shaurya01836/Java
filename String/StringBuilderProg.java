public class StringBuilderProg {

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            string.append(ch);
        }
        System.out.println(string);
        System.out.println("Length is : " + string.length());
    }
}
