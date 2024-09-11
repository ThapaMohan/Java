import java.io.*;
public class RandAccessFile {
    public static void main(String[] args) {
        try {
            // Create an instance of RandomAccessFile in read-write mode ("rw")
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Write some content to the file
            file.writeUTF("Hello, World!");
            file.writeInt(42);
            file.writeDouble(3.14159);

            // Seek to the beginning of the file
            file.seek(0);

            // Read the content back from the file
            String message = file.readUTF();
            int number = file.readInt();
            double pi = file.readDouble();

            // Display the read content
            System.out.println("Message: " + message);
            System.out.println("Number: " + number);
            System.out.println("Pi: " + pi);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

