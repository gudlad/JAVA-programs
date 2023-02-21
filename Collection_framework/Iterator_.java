package Collection_framework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_ {
    public static void main(String[] args) {
        ArrayList num=new ArrayList(Arrays.asList(3,2,1,0,19,20,2,11));
        Iterator itr=num.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    
    }
    
}
