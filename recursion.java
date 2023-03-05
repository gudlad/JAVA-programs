public class recursion{

    public static int recursion1(int n)
    {
        if(n==0)
        {
            return n;
        }
        return (n%10)+recursion1(n/10);

    }
    public static int recursion2(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return (n%10)*recursion2(n/10);

    }

    public static void recursion3(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        recursion3(n-1);
    }

    public static void recursion4(int n)
    {
        if(n==0)
        {
            return;
        }
        recursion4(n-1);
        System.out.println(n);
    }

    public static int sum=0;

    // public static recursion5(int n)
    // {
     
    // //     int reverse=0;
    // //     while(n>0)
    // //     {
    // //         int temp=n%10;
    // //         reverse=reverse*10+temp;
    // //         n=n/10;
    // //     }
    // // return reverse; 

    // }
    private static void recursion5(int n) {
        if (n==0)
        {
            return;
        }
        int temp=n%10;
        sum=(sum*10)+temp;
        recursion5(n/10);
    }

    static int count(int n)
    {
        return helper(n,0);
    }

    static int helper(int n,int c)
    {
        if(n==0)
            return c;
        int rem=n%10;
        if(rem==0)
            return helper(n/10,c+1);
        else
            return helper(n/10, c);
    }
    public static void main(String[] args) {
        
    // System.out.println(recursion1(555));
    // System.out.println(recursion2(123));
    // recursion3(5);
    // recursion4(5);
    // System.out.println(recursion5(123));
    // recursion5(123);
    // System.out.println(sum);
    System.out.println(count(100));
    

    }
}