import java.util.Scanner;
import java.util.Arrays;

public class Anagram_strings {

public static boolean isAnagram(char[] s1,char[] s2) {
    Arrays.sort(s1);
    Arrays.sort(s2);
    String s1_=String.valueOf(s1);
    String s2_=String.valueOf(s2);
    return s1_.equals(s2_)?true:false;
}
public static void main(String[] args) {
    // String str1 ="listen";
    // String str2 ="silent";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the  first word");
    String str1=s.next();
    System.out.println("Enter the  first word");
    String str2=s.next();
    char[] s1=str1.toCharArray();
    char[] s2=str2.toCharArray();
    System.out.println(isAnagram(s1,s2));

}
}
