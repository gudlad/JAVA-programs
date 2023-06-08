import java.util.*;

public class PairOfSocks
{
    public static int sockMerchant(int n, List<Integer> ar) {
    int noOfSocksPairs = 0;
    Map<Integer, Integer> socksMap = new HashMap<Integer, Integer>();
    for(Integer a : ar) {
        if(!socksMap.containsKey(a)) 
            socksMap.put(a, 1);
        else
           socksMap.put(a, socksMap.get(a)+1);
    }
    System.out.println(socksMap);
    for(Integer a :socksMap.keySet())
    {
        noOfSocksPairs+=(int)socksMap.get(a)/2;
    }

    return noOfSocksPairs;
}
public static void main(String[] args) {
    System.out.println(sockMerchant(9, Arrays.asList(10,20,20,10,10,30,50,10,20)));
}
}