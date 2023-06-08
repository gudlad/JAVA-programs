import java.util.*;
public class Array_rotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // List<Integer> ans=new ArrayList<>();
        //  Collections.rotate(a, k);
        // int rot=k;                   // 1 2 3 // 3 1 2  // 2 3 1
        // while(rot!=0)
        // {
        //     int newIndex= a.get(i)+k % a.size();
            
        // }
        List<Integer> ans=new ArrayList<>();
    //     int itr=k;
    //     while(itr!=0)
    //     {
    //     int temp=a.get(a.size()-1);
    //     for(int i=a.size()-2;i>=0;i--)  // 1 2 3    // 3 1 2  // 2 3 1 
    //     {
    //         a.set(i+1,a.get(i));
    //     }
    //     a.set(0,temp);
    //     itr--;
    //     }
        int effectiveRotation = k%a.size();
        Map<Integer,Integer> rmap=new HashMap<>();
        for(int i=0;i<a.size();i++)
        {
            int index=(i+effectiveRotation)%a.size();
            rmap.put(index,a.get(i));
        }
        for(int i:queries)
            ans.add(a.get(i));
    return ans;
        }


        public static void main(String[] args) {
            System.out.println(circularArrayRotation(Arrays.asList(1, 2, 3),2,Arrays.asList(0,1,2)));
        }
    
    }