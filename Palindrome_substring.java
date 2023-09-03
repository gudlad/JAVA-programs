import java.util.Scanner;

public class Palindrome_substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long num=s.nextLong();
        System.out.println(processPalindrome(num));
        s.close();
    }
    
    private static int processPalindrome(long num) {   
        int count=0;
        String numString=String.valueOf(num);
        while(isPalindrome(numString))
        {
            if(numString.length() < 2)
                break;
            count++;
            numString=numString.substring(1, numString.length()-1);
        }
        return count;
        
    }

    private static boolean isPalindrome(String num) {
        StringBuffer sb=new StringBuffer(num);
        return num.equals(sb.reverse().toString());
    }
}
