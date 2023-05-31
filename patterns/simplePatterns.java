// package patterns;

public class simplePatterns {

    // public static void main(String[] args)
    // {
    // for(int i=0;i<5;i++)
    // {
    // for(int j=0;j<=i;j++)
    // {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args)
    // {
    // for(int i=0;i<5;i++)
    // {
    // for(int j=5;j>i;j--)
    // {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args)
    // {

    // for(int i=0;i<5;i++)
    // {
    // int num=1;
    // for(int j=0;j<=i;j++)
    // {
    // System.out.print(num++);
    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        pattern(4);
    }

    // public static void pattern(int n)
    // {
    // for(int row=0;row<2*n;row++)
    // {
    // int ncol= row>n? 2*n-row:row;// N-(row-N)
    // for(int column=0;column< ncol;column++)
    // {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void pattern(int n)
    // {
    // for(int row=0;row<2*n;row++)
    // {
    // int ncol= row>n? 2*n-row:row;// N-(row-N)
    // int noOfSpaces=n-ncol;
    // for(int i=0;i<noOfSpaces;i++)
    // {
    // System.out.print(" ");
    // }
    // for(int column=0;column< ncol;column++)
    // {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void pattern(int n) {
    // for (int row = 1; row <= 5; row++) {
    // int noOfSpaces = n - row;
    // for (int space = 0; space < noOfSpaces; space++) {
    // System.out.print(" ");
    // }

    // for (int i = row; i >= 1; i--) {
    // System.out.print(i+" ");
    // }
    // for (int j = 2; j <= row; j++) {
    // System.out.print(j+" ");
    // }
    // System.out.println();
    // }
    // }

    // public static void pattern(int n) {
    // for (int row = 1; row <= 2*n; row++) {

    // int c= row>n? 2 * n -row : row;

    // int noOfSpaces = n -c;
    // for (int space = 0; space < noOfSpaces; space++) {
    // System.out.print(" ");
    // }

    // for (int i = c; i >= 1; i--) {
    // System.out.print(i+" ");
    // }
    // for (int j = 2; j <= c; j++) {
    // System.out.print(j+" ");
    // }
    // System.out.println();
    // }
    // }

    // public static void pattern(int n) {
    //     n=2*n;
    //     for (int row = 0; row <=n; row++) {
    //         for (int col = 0; col <= n; col++) {
    //             int value=Math.min(Math.min(row,col),Math.min(n-row,n-col));
    //             System.out.print(value+" ");
    //         }
    //         System.out.println();
    //     }

    // }

    
    public static void pattern(int n) {
        int original=n;
        n=2*n;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <= n; col++) {
                int value=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(value+" ");
            }
            System.out.println();
        }

    }


}