package Exception_handling;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            int num=Integer.parseInt(reader.readLine());
            System.out.println("num: " + num);
        }
    }

}

