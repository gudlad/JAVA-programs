public class String_character_occurance {
    public static void main(String[] args) {
        String name="guruprasad";
        int[] characterOccurance=new int[256];

        for(int i=0;i<name.length();i++)
        {
            characterOccurance[name.charAt(i)] +=1;
        }
        
        for(int i=0;i<characterOccurance.length;i++)
        {
            if(characterOccurance[i]!=0)
            {
                System.out.println((char)i+"->"+characterOccurance[i]);
            }
        }

    }
}
