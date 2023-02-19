import java.util.Arrays;

public class String_builtIn_operations
{
    //String methods
public static void main(String[] args) {
    String str="Kodenest pvt Ltd";
    // 1
    String s1=str.toUpperCase();
    // 2
    String s2=str.toLowerCase();
    // 3
    String s3=str.substring(8,12);
    // char at endIndex will not be included
    String s4=str.substring(2);

    // 4
    boolean contains=str.contains("K");

    // 5
    char[]  chararray=str.toCharArray();

    // 6
    String[] words=str.split(" ");

    // 7
    String bigStr=str.concat("_softwares");

    // 8
    char c=str.charAt(0);

    System.out.println(str);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);  
    System.out.println(s4);
    System.out.println(contains);
    System.out.println(Arrays.toString(chararray));
    System.out.println(Arrays.toString(words));
    System.out.println(c);

    







}
}