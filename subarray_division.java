import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class subarray_division{
    
public static void main(String[] args) {
    System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(4)), 4, 1));
}

public static int birthday(List<Integer> s, int d, int m) {
        int count=0;
        for(int i=0;i<=s.size()-m;i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                sum+=s.get(j);
            }
            if(sum==d)
                count++;
        }
        return count;
    }


}
