import java.io.FileReader;
import java.util.Scanner;

public class FileHandling3 {
    public static void main(String[] args) {
        int word = 1;
        int line = 0;
        try {
            FileReader f = new FileReader("data.txt");
            Scanner scn = new Scanner(f);
            while (scn.hasNextLine()) {
                line++;
                String filedata = scn.nextLine();
                for (int i = 0; i < filedata.length(); i++) {
                    if (filedata.charAt(i) == ' ') {
                        word++;
                    }
                }
            }
            System.out.println("Word count : " + word);
            System.out.println("line count : " + line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
