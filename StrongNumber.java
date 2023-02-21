
public class StrongNumber {
    public static void main(String[] args) {
        int checkNum=145;
        /*
         * What is Strong number ?
         * 145 is a strong number 
         * because 1!+4!+5! = 145
         */

        int sum=0;
        int num=checkNum;
        while(num>0)
        {
            int temp=num%10;
            int factorial=findFactorial(temp);
            sum+=factorial;
            num=num/10;
        }
    System.out.println(sum==checkNum?"Strong Number":"Not a Strong Number");

    }

    public static int findFactorial(int temp) {
        if(temp==0 || temp==1)
        {
            return 1;
        }
        else 
            return temp*findFactorial(temp-1);
    }
}
