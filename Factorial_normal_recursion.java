import java.util.Scanner;

public class Factorial_normal_recursion {
    public static int findFactorial_rec(int s1) {
        if (s1 == 1 || s1 == 0)
            return 1;
        else
            return s1 * findFactorial_rec(s1 - 1);
    }

    public static int findFactorial(int s1) {
        int result = 1;
        if (s1 == 0 || s1 == 1) {
            result = 1;
        } else {
            for (int i = 1; i <= s1; i++)
                result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        // System.out.println(findFactorial(s1));
        System.out.println(findFactorial_rec(s1));
    }
}
