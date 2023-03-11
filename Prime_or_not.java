import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Prime_or_not {

    public static boolean isPrime(int num) {

        boolean isprime = true;

        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0)
                isprime = false;

        }
        return isprime;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(isPrime(num) ? "it is a prime" : "it is not a prime");
    }
}
