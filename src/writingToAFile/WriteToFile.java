package writingToAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("writeFile1.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("One");
        pw.println("Two");
        pw.println("Three");

        pw.close();
    }
}
