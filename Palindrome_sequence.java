public class Palindrome_sequence {

    public static boolean checkPalindrome(String str){ // string reverse method
        String reverse="";
        boolean result = false;
        for(int i=str.length()-1; i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse))
            result=true;
        return result;
    }

    public static boolean checkPalindrome_bySequence(String str){ // 2 pointer method
        int start=0;
        int end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
                return false;
        start++;
        end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abba";
        
/*      if(checkPalindrome(str))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome"); 
*/
        System.out.println(checkPalindrome_bySequence(str)?"palindrome":"not palindrome");
    }
}
