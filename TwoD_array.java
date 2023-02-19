import java.util.Scanner;

class TwoD_array{
    public static void main(String[] args) {
        String[][] array = new String[2][2];
        Scanner s=new Scanner(System.in);
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) 
                array[i][j]=s.next();
            
        }
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
                System.out.println();
        }
    }
}