import java.util.*;

public class Divisible_sum_pairs {

        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
            int count=0;
            for(int i=0;i< n;i++)
            {
                int temp=ar.get(i);
                for(int j=0;j< n ;j++)
                {
                    if(j!=i &&  j>i && (temp+ar.get(j))%k==0)
                        count++;
                }
               
            }
            return count;
    
        }

        public static void main(String[] args) {
            divisibleSumPairs(6, 3, new ArrayList<Integer>((Arrays.asList(1, 3 , 2, 6, 1, 2))));
        }

    }

