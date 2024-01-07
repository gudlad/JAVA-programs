import java.util.Arrays;

public class Swap_2Strings {
    public static void main(String[] args) {
        String a="guru";
        String b="prasad";
        // System.out.println(a+" "+b);
        // String temp=a;
        // a=b;
        // b=temp;
        // System.out.println(a+" "+b);

        // b=a+b;
        // a=b.substring(a.length(), b.length());
        // b=b.substring(0, b.length()-a.length());
        // System.out.println(a+" "+b);



// Ensure both strings have the same length
int maxLength = Math.max(a.length(), b.length());
a = String.format("%-" + maxLength + "s", a);
b = String.format("%-" + maxLength + "s", b);
System.out.println(a +" "+b);

char[] str1 = a.toCharArray();
char[] str2 = b.toCharArray();

for (int i = 0; i < str2.length; i++) {
    int temp = str1[i] ^ str2[i];
    str1[i] = (char) (temp ^ str1[i]);
    str2[i] = (char) (temp ^ str2[i]);
}

System.out.println(Arrays.toString(str1) + "\n" + Arrays.toString(str2));

    System.out.println(String.format("%-10s", "guru"));
    System.out.println(String.format("%-10s", "santho"));

    }
}
