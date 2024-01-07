package StringBuilder_StringBuffer;


public class StringBuilder_{
    public static void main(String[] args) {
        // String str=" j a a v a";
        // // String plain=str.replaceAll("\\s", "");
        // // System.out.println(plain);


        // StringBuilder sb=new StringBuilder(str);
        // for(int i=0;i<sb.length();i++)
        // {
        //     if(sb.charAt(i)==' ')
        //         sb.deleteCharAt(i);
        // }
        // System.out.println(sb.toString());

        String str="programming";
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(x->sb.append((char)x));
        System.out.println(sb);
        
        String plain="";
        for(int i=0;i<str.length();i++)
        {
            if(!plain.contains(String.valueOf(str.charAt(i))))
            {
                plain+=str.charAt(i);
            }
        }
        System.out.println(plain);

        

        

































    }
}