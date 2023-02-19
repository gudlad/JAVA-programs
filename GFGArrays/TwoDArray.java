package GFGArrays;

import java.util.Scanner;

public class TwoDArray
{
public  static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int[][] twoDarrray=new int[4][4];
    // int rows=s.nextInt();
    // int cols=s.nextInt();

// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < cols; j++) {
//         twoDarrray[i][j]=j;
//     }
// }

for (int i = 0; i < 4 ; i++) {
    for (int j = 0; j < twoDarrray[i].length; j++) {
        twoDarrray[i][j]=j;
    }
}

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < twoDarrray[i].length; j++) {
        System.out.print(twoDarrray[i][j]+"\t");
    }
    System.out.println();
}

}
}