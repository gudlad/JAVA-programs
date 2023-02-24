import java.lang.Math;

class AutoMorphicNumber
{
    public static void main(String[] args) {
        int num=376;
        boolean isAutoMorphic=AutoMorphicNumber(num);
        System.out.println(isAutoMorphic?"true":"false");        
    }
    public static boolean AutoMorphicNumber(int num)
    {
        int squredNum=(int)Math.pow(num,2);

        while(num>0)
        {
            if(num%10!=squredNum%10)
            {
                return false;
            }
            num=num/10;
            squredNum=squredNum/10;

        }
        return true;
    }
}