import java.io.*;

public record WritingToFile() {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos=new FileOutputStream("bbc.txt");
        fos.write(12);
        System.out.println("data is saved");
        fos.close();
    }
}
