package patterns;
public class FloydsTriangle {
        public  static void main(String[] args) {
        int n=6;
        int num=1;
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
