

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SelfCopier {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("SelfCopier.java");
            writer = new FileWriter("CopyOfSelfCopier.txt");

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Source code copied to CopyOfSelfCopier.java");
        } catch (IOException e) {
            System.err.println("Error copying source code: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
