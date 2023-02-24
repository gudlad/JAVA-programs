class HarshadNumber
{
    public static void main(String[] args) {
        /*
         * hashad number:
         * the number which is completely divided by the sum of it's digits
         */
        int num=18;
       boolean result=harshad(num);
       System.out.println(result);
    }
    public static boolean harshad(int num)
    {
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            int temp2=temp%10;
            sum+=temp2;
            temp=temp/10;

        }
        return num%sum==0;
    }
}