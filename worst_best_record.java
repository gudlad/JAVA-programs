import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class worst_best_record {

    public static List<Integer> breakingRecords(List<Integer> scores) {  //10, 5, 20, 20 ,4, 5, 2 ,25 ,1
        int worstRecordBreak=0;
        int bestRecordBreak=0;
        int BestRecord=scores.get(0);
        int worstRecord=scores.get(0);

        for(int i:scores)
        {
            if(i > BestRecord)
            {
                bestRecordBreak++;
                BestRecord=i;
            }
            else if(i < worstRecord )
            {
                worstRecord=i;
                worstRecordBreak++;
            }
        }
       List<Integer> result=Arrays.asList(bestRecordBreak, worstRecordBreak);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(breakingRecords(new ArrayList<Integer>(Arrays.asList(10, 5, 20, 20 ,4, 5, 2 ,25 ,1))));
    }

}