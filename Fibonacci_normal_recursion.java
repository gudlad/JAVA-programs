
import java.util.Scanner;

class Fibonacci_normal_recursion{
    public static int Fibonacci_normal(int num)
    {
        int f0=0;
        int f1=1;
        int result=0;
        for(int i=2; i<=num; i++)
        {
            result=f0+f1;
            f0=f1;
            f1=result;
        }
        return result;
    }
    public static int Fibonacci_recursion(int num)
    {
        if(num==0||num==1)        

        {
            return num; 
        }
        return Fibonacci_recursion(num-1)+Fibonacci_recursion(num-2);

        
       
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int num=s.nextInt();
        // Fibonacci_normal(num);
        for(int i=0;i<10;i++)
        //  System.out.println(Fibonacci_normal(i));
         System.out.println(Fibonacci_recursion(i));

    }
}