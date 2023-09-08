import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the  first word");
    String str1=s.next();
    StringBuilder sb=new StringBuilder(str1);
    System.out.println(sb.reverse());
    }
}
