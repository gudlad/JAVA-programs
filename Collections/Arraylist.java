package Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        // ArrayList operations

        // 1. add
        al.add(10);
        al.add("deeper");
        al.add(true);
        al.add(99);
        
        // add at particular index
        al.add(2, "chatGPT");
        
        
        // 2. set
        al.set(3,false);
        
        System.out.println(al);

        // 3.get
        System.out.println(al.get(0));

        // 4. addAll
        String[] veg={"potato", "onion"};
        String[] fruits={"mango","banana","papaya"};
        ArrayList vegList=new ArrayList(Arrays.asList(veg));
        ArrayList fruList=new ArrayList(Arrays.asList(fruits));
        ArrayList mergedList=new ArrayList();
        mergedList.addAll(vegList);
        mergedList.addAll(fruList);
        System.out.println(mergedList);

    }

    
}
