package readingFromAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String paht = separator + "Users" + separator + "file";
//        File file = new File(paht);

        {
            File file = new File("readFile1");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
//_____________________________________________________________________
        {
            File file = new File("readFile2");
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[5];
            int counter = 0;

            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            System.out.println(Arrays.toString(numbers));
            scanner.close();
        }
    }
}
