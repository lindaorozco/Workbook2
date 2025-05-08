package Week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercises {
    public static void main(String[] args) {
        singleFileLine();
        readFileBack();
        multipleLines();


    }

    /// ///////////////////////////////////////////////////////////////////

    // 1. Write a single line to a file
    public static void singleFileLine() {
        try {
            // Create a FileWriter to write to data/output.txt
            FileWriter Fwrite = new FileWriter("output.txt");

            // Write a single line to the file
            Fwrite.write("Hello Linda. Welcome to your file \n");
            Fwrite.write(" Appear in file ");

            // close the writer when done

            Fwrite.close();
        } catch (IOException e) {
            // in case wrong, print an error
            System.out.println(e.getMessage());
        }
    }

    // 2. Read that line back
    public static void readFileBack() {

        try (BufferedReader readFile = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = readFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Write multiple lines from an array
    public static void multipleLines() {
        try {
            FileWriter Fwrite = new FileWriter("output.txt");

            String[] poem = {
                    "Roses are red \n",
                    "Violets are blue \n",
                    "Don't make me \n",
                    "Hate u \n",
            };
            for (String text : poem) {
                Fwrite.write(text);

            } Fwrite.close();
        } catch (IOException e) {
            // this is in case something goes wrong

            System.out.println("Something went wrong" + e.getMessage());
        }

    }
}


