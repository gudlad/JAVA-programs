import java.util.Arrays;

public class Konest_phno_digit_occurance {
    public static void main(String[] args) {
        String phno="9245423433";
        int[] digitOccurance=new int[10];

        for(int i=0;i<phno.length();i++)
        {
            digitOccurance[Character.getNumericValue(phno.charAt(i))] +=1;
        }
        
        for(int i=0;i<digitOccurance.length;i++)
            System.out.println("Digit " + i + ": " + digitOccurance[i]);

    }
}
