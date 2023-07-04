package Serialization_Deserialization_java;
import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student=new Student("guruprasad","guru@gmail.com",20,"bangalore");

        // write data to the file
        FileOutputStream fos=new FileOutputStream("studentObject.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        // how to serialize
        oos.writeObject(student);
        oos.close();
        fos.close();
        System.out.println("object state is transferred to file studentObject.txt");
    }
}
