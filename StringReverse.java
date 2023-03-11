public class StringReverse{
    public static String reverse(String str) {
        char[] strarray=str.toCharArray();
        char[] strarray2=new char[strarray.length];
        int j=0;
        for(int i=strarray.length-1; i>=0; i--)
        {
            strarray2[j++]=strarray[i];
        }
        return new String(strarray2);
    }
}