
import java.io.FileReader;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {
        try {
            // File f = new File("data.txt");
            FileReader f = new FileReader("data.txt");
            Scanner scn = new Scanner(f);
            while (scn.hasNextLine()) {
                String filedata = scn.nextLine();
                System.out.println(filedata);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
