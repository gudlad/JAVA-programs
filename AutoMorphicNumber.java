import java.lang.Math;

class AutoMorphicNumber
{
    public static void main(String[] args) {
        int num=10;
        int squredNum=(int)Math.pow(num,2);
        // 25 625
        boolean AutoMorphicNumber_=true;
        while(num>0)
        {
            int temp1=num%10;
            int temp2=squredNum%10;
            if(temp1==temp2)
            {
                num=num/10;
                squredNum=squredNum/10;
            }
            else
            {
                AutoMorphicNumber_=false;
                break;
            }

        }
    System.out.println(AutoMorphicNumber_?"true":"false");        
    }
}