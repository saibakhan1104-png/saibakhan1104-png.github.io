import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteDemo {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new File("student.txt"))) {
            out.println("Java Learning Portfolio");
            out.println("Text file I/O example");
            System.out.println("File written successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to create file.");
        }
    }
}
