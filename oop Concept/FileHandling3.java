import java.io.FileReader;
import java.util.Scanner;

public class FileHandling3 {
    public static void main(String[] args) {
        int word = 0;
        int line = 0;
        try {
            FileReader f = new FileReader("data.txt");
            Scanner scn = new Scanner(f);
            while (scn.hasNextLine()) {
                line++;
                String filedata = scn.nextLine();
                boolean inWord = false;

                for (int i = 0; i < filedata.length(); i++) {
                    if (filedata.charAt(i) != ' ' && !inWord) {
                        word++;
                        inWord = true;
                    } else if (filedata.charAt(i) == ' ') {
                        inWord = false;
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

