class PerfectNumber{
    public static void main(String[] args) {
        int checkNum=14;
        
        /*
         * What is Perfect number ?
         * 6 is a perfect number 
         * because 1+2+3 = 6
         * where 1,2,3 are factors of 6
         */

        int sum=0;
        for(int i=1;i<checkNum;i++)
        {
            if(checkNum%i==0)
                sum+=i;
    }
    System.out.println(sum==checkNum?"Perfect Number":"Not a Perfect Number");

    }
}