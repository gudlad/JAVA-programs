import java.util.LinkedHashMap;
public class LinkedHashmap
{
    public static void main(String[] args) {
        LinkedHashMap map=new LinkedHashMap();
        // doesn't maintain the order of insertion
        map.put(771,"Deep");
        map.put(171,"Kushal");
        map.put(501,"Saurav");
        map.put(873,"Kushal");
        map.put(111,"Ayush");
    
     System.out.println(map);
    
        }
}