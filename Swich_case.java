import java.util.Scanner;
class Swich_case{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int GDP=s.nextInt();
    switch(GDP)
    {
        case 1,2,3,4 -> System.out.println("E");
        case 5,6,7,8->System.out.println('D');
        case 9,10->System.out.println('A');
    }
}

}