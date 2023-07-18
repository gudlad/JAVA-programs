import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileData {
    public static void main(String[] args) throws IOException {
        {
            FileInputStream fis = new FileInputStream("D:\\KN JAVA WorkSpace\\JAVA-programs\\Java_IO_Streams\\abc.txt");
            FileOutputStream fos = new FileOutputStream("D:\\KN JAVA WorkSpace\\JAVA-programs\\Java_IO_Streams\\bbc.txt", true);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("file copied");
            fis.close();
            fos.close();
        }
    }
}
