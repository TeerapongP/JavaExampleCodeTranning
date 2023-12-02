package FileInputStreamExample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWrite {
    public static void main(String[] args) {
        try (FileOutputStream file = new FileOutputStream("example.txt")) {
            String data = "Hello, World!!";
            byte[] bytes = data.getBytes();
            file.write(bytes);
            System.out.println("Data has been written to the file.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
