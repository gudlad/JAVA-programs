
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFile {
        public static void main(String[] args) throws IOException {
                FileInputStream fis = new FileInputStream(
                                "D:\\KN JAVA WorkSpace\\JAVA-programs\\Java_IO_Streams\\abc.txt");
                // int data=fis.read();
                // System.out.println(data);
                // System.out.println(fis.available());

                // while (fis.available() != 0) {
                //         System.out.println((char) fis.read());
                // }
                int data;
                while((data=fis.read()) != -1)
                {
                        System.out.println((char)data);
                }
                //! if there are no bytes available read() returns -1;
                //? EOF = -1
        }
}
