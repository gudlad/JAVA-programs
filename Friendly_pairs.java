public class Friendly_pairs{
    public static void main(String[] args) {
        /* Friendly pairs
         * check 6,28  are friendly paris
         * divisors of 6 -> 1,2,3,6 
         * sum of divisors of 6 -> 12
         * divisors of 28 -> 1,2,4,8,14,28
         * sum of divisors of 28 -> 57
         * for both 6,28 do,
         * sum/6 = 12 / 6 = 2
         * sum/28 = 57 / 28 =2
         * here 2==2 i.e result is equal so 6,28 are friendly pairs
        */

        int a=8;
        int b=28;
        System.out.println(isFriendlyPair(sum(a),a,sum(b),b));
        
    }
    public static boolean isFriendlyPair(int a,int b,int c,int d) 
    {
        return (int)(a/b)==(int)(c/d);
    }

    public static int sum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                sum+=i;
        }
        return sum;
    }
}
