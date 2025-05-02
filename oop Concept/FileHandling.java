
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {

        try {
            File data = new File("data.txt");
            if (data.createNewFile()) {
                System.out.println("File created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
