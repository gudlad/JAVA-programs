package patterns;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n; i++) {
// for space
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
// for star
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
