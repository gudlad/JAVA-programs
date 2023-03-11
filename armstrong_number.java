import java.util.Scanner;
import java.lang.Math;
class armstrong_number{

    public static boolean isArmStrongNumber(long b)
    {
        int len=String.valueOf(b).length();
        long result=0;
        long a=b;
        while(a>0)
        {
            long temp=a%10;
            result+=Math.pow(temp,len);
            a=a/10;

        }
       return (b==result)? true: false;
       
    }

    public static void main(String[] args)
    {
        System.out.println("Enther the number");
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        System.out.println(isArmStrongNumber(a));
        s.close();
    }
}