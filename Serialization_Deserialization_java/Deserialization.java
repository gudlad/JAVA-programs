package Serialization_Deserialization_java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("out/production/Serialization_Deserialization_java/Serialization_Deserialization_java/studentObject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println(student);
    }
}
