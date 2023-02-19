import java.util.HashMap;

class hashMap{

    public static void main(String[] args) throws Exception{

        HashMap<Integer,Integer>map=new HashMap<>();
        
        int[] array={10,30,10,20,10,20,30,10};
        for(int i:array)
       {
        if(!map.containsKey(i))
        {
            map.put(i,1);
        }
        else
        {
            map.put(i,map.get(i)+1);
        }
    }
    System.out.println(map);
    }
    }
    

