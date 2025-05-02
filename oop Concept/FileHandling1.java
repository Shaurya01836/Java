
import java.io.FileWriter;
import java.util.Scanner;


public class FileHandling1 {

    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("data.txt");
            String content;
            Scanner scn = new Scanner(System.in);
            content = scn.nextLine();
            f.write(content);
            f.close();
            System.out.println("Succesfully write");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
