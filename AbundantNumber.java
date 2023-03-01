class AubundantNumber{
    public static void main(String[] args) {
        /*
         * 12 is abundant number
         * as all factors of 12 1,2,3,4,6
         * add upto 16 i.e >12
         */
        int num=12;
        detectAubundant(num);
        }
        public static void detectAubundant(int num)
        {
            int sum=0;
           for(int i=1; i<num; i++)
           {
            if(num%i==0)
            {
                sum+=i;
            }
           }
           System.out.println(sum>num?"Aubundant":"not Aubundant");
        }
    }
