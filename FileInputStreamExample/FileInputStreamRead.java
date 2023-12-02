package FileInputStreamExample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamRead {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream(
                "example.txt")) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
