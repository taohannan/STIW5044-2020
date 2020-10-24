import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        try {
//            src/resources/inputFile.txt
            File inputFile = new File("E:\\UUM\\STIW5044\\Exception\\exercise-1\\src\\resources\\inputFile.txt");
//            File inputFile = new File(String.valueOf(Paths.get(" resources/inputFile.txt")));
            Scanner reader = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter("outputFile.txt");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String output = TextFileUtils.removeWhiteSpaces(data);
                writer.println(output);
                System.out.println(output);

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
